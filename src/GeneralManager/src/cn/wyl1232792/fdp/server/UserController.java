package cn.wyl1232792.fdp.server;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.factory.UserFactory;
import cn.wyl1232792.fdp.util.Encrypt;

public class UserController extends Controller {


	public final static int OPT_REGISTER = 0;
	public final static int OPT_LOGIN = 1;
	public final static int OPT_USERINFO = 2;
	public final static int OPT_CHANGE_PASSWORD = 3;
	
	UserFactory _userFactory;
	
	public UserController() {
		_userFactory = new UserFactory();
	}
	
	@Override
	void registerMethods() {
		registerMethod(OPT_REGISTER, "register");
		registerMethod(OPT_LOGIN, "login");
		registerMethod(OPT_USERINFO, "getUserinfo");
		registerMethod(OPT_CHANGE_PASSWORD, "changePassword");
	}
	
	public void login(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JsonApi ja = new JsonApi(response);
		boolean flag = user.authenicationFromLogin(request.getParameter("username"), Encrypt.md5(request.getParameter("password")));
		if (flag) {
			ja.getJSON().put("user_token", user.getToken());
			ja.setSuccess(200);
			ja.write();
		} else {
			ja.echoError(401, 1, "login failed");
		}
	}

	public void register(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JsonApi ja = new JsonApi(response);
		// user has logged in
		if (user.getId() > 0) {
			ja.echoError(401, 2, "user already exists");
			return;
		}
		User u = new User();
		u.setUsername(request.getParameter("username"));
		u.setPassword(Encrypt.md5(request.getParameter("password")));
		if (_userFactory.create(u))
			ja.echoResult("success");
		else
			ja.echoError(406, 3, "invalid input");;
	}
	
	public void getUserinfo(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JsonApi ja = new JsonApi(response);
		ja.echoResult(user.generateJsonObject());
	}

	public void changePassword(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}
}
