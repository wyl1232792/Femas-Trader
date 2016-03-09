##数据库操作
###所封装的类
*	DatabaseHandler -- interface -- 数据库请求接口  
	DatabaseHelper -- abstract class implements DatabaseHandler -- 数据库请求实例  
	MysqlHelper -- class extends DatabaseHelper -- 带mysql驱动的数据库实例  
	DatabaseModel -- abastract class -- 主要的数据实例，可以直接存取数据库和转json，派生来实现具体数据  
	ModelCollection -- class -- DatabaseModel的集合类，可能和高层逻辑关联，暂时还没有实现  
	QueryStatement -- class -- sql语句生成器，也可以直接自己写  
	DBFactory -- class -- DatabaseModel的工厂，通过派生来实现具体内容  

###推荐使用方法
####最原始的存取数据（基本使用本项目封装的方法）
``` java
	DatabaseHandler _dbHandler = new MysqlHelper(); //生成数据库连接
	ResultSet rs = _dbHandler.simpleQuery("SELECT * FROM `users` where id=1 LIMIT 1");//根据sql语句查询user表的结果集
	if (rs.next())
	{
		int name = rs.getString('username'); //获取一个user的用户名字段
	}
```

####use QueryStatement
*	与上一个实例一样，但可以使用生成器做一些优化
``` java
	DatabaseHandler _dbHandler = new MysqlHelper(); //生成数据库连接
	ResultSet rs = _dbHandler.simpleQuery(
		new QueryStatement("users")
			.where("id", "=", "1")
			.selectOne();
	);//根据sql语句查询user表的结果集
	if (rs.next())
	{
		int name = rs.getString('username'); //获取一个user的用户名字段
	}
```

####use DatabaseModel
*	派生DatabaseModel类，简化读取，封装数据
``` java
	public class User extends DatabaseModel{} //里面忽略
	DatabaseHandler _dbHandler = new MysqlHelper(); //生成数据库连接
	User user = new User().readFromResultSet(_dbHandler.simpleQuery(
		new QueryStatement("users")
			.where("id", "=", "1")
			.selectOne();
	));
	//user已经都去了数据库数据
	user.getUsername();

	//插入User
	User _user = new User(GROUP_ADMIN);//创建一个要写入的admin用户
	_databaseHelper.executeQuery(
		new QueryStatement('users')
			.insertOne(_user);
	); //写入数据库
```

####use DBFactory
*	进一步整合之前所有繁杂的内容  
	推荐使用这一种，如果有新需要，在factory里面新建方法来做，然后外部调用
``` java
	public class UserFactory extends DBFactory{} //里面忽略，已经实现
	//工厂自有数据库连接
	UserFactory _userFactory = new UserFactory();

	_userFactory.create(new User(GROUP_ADMIN)); //向数据库写入一个管理员用户
	_userFactory.getUserByToken("gawergaewgrwgra"); //取出一个对应的user模型 相当于 
	//SELECT * FROM `users` WHERE user_token='gawergaewgrwgra' LIMIT 1
```

##网络服务端操作，用于管理员和用户发送请求
###所封装的类
*	InsideServer -- abstract class -- 所有服务对象的父类  
	InsideHttpServer -- class extends InsideServer -- http服务对象  
	Reciever -- class -- 暂时没有用，当服务器接收到内容是，reciever会运行代码，派生实现  
	Router -- class extends AbstractHandler -- 接受到请求后，根据请求地址分发给注册的Controller  
	Controller -- abstract class -- 接收到对应的请求后，根据参数中的opt来分发给对应方法处理，派生实现  
	ResponseDecorator -- class -- 给返回的http数据做操作封装，简化代码，派生实现  
	JsonApi -- class extends ResponseDecorator -- 给response封装预设的json返回框架  

###推荐使用方法
####实现简单处理网络请求 -> 注册控制器 -> 注册方法
``` java
	public class UserController extends Controller {
		public final static int OPT_REGISTER = 0; //定义操作ID
		
		@Override
		void registerMethods() {
			registerMethod(OPT_REGISTER, "register"); //注册方法，名为register
		}

		//建立注册方法， 参数名必须相同，否则找不到方法
		public void register(
			User user, //代表当前请求的用户，如果没有登陆，则为guest用户，有外部逻辑注入，不需要再验证
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
			response.setStatus(200);
			Writer out = response.getWriter();
			out.println("Hello World"); //网页上会显示hello world
		}
	}

	class Router {
		void registerControllers() {
			registerController("/user", new UserController());
		}
	}
```

####使用jsonApi封装操作response
``` java
	//与上例相同，仅重写register方法
	public class UserController extends Controller {
		public void register(
			User user, //代表当前请求的用户，如果没有登陆，则为guest用户，有外部逻辑注入，不需要再验证
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException {

			JsonApi ja = new JsonApi(response); //生成api实例
			// user has logged in
			if (user.getId() > 0) { //如果用户已登录则返回
				ja.echoError(401, 2, "user already exists"); //给response写入错误信息
				return;
			}
			User u = new User(); //生成新用户
			u.setUsername(request.getParameter("username")); //从请求中读入数据
			u.setPassword(Encrypt.md5(request.getParameter("password")));
			if (_userFactory.create(u)) //创建用户
				ja.echoResult("success"); //写入结果信息
			else
				ja.echoError(406, 3, "invalid input");;
		}
	}
```

##数据请求(还待完善)
###所封装的类
*	DataRetriver -- abstract class -- 抽象类  
	WebApiDataRetriever -- class extends DataRetriever -- http请求的实现类  
	CTPMdRetriver -- class extends DataRetriever -- CTP接口交互的实现类（还没实现）  

###方法
####单例http请求并写入DatabaseModel（异步）
``` java
	public void run() {
		//utf-8
		User user;
		String url = "http://localhost:2333/test?opt=2333";
		String method = "GET";
		String params = "";
		new WebApiDataRetriver().getJson(
			url,
			method,
			params,
			(JSONObject jo) -> {
				user.readFromJsonObject(jo); //读取json
				new UserFactory().create(user); //写入数据库
			}
		);
	}
```
