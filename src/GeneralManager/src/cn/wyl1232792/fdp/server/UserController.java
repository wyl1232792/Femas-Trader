package cn.wyl1232792.fdp.server;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyl1232792.fdp.FinancialDataPlatform;
import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.factory.UserFactory;
import cn.wyl1232792.fdp.util.Encrypt;

public class UserController extends Controller {

	UserFactory _userFactory;
	
	public UserController() {
		_userFactory = new UserFactory();
	}
	
	@Override
	void registerMethods() {
		registerMethod(0, "register");
		registerMethod(1, "home");
	}
	
	public void home(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		Writer w = response.getWriter();
		w.write("hello world");
	}

	public void register(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		user.setUsername(request.getParameter("username"));
		user.setPassword(Encrypt.md5(request.getParameter("password")));
		try {
			_userFactory.create(user);
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
}
