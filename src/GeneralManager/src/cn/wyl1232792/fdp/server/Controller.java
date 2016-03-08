package cn.wyl1232792.fdp.server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.factory.UserFactory;

abstract public class Controller {

	Map<Integer, Method> methods;
	UserFactory _userFactory;
	public Controller() {
		methods = new HashMap<Integer, Method>();
		registerMethods();
		_userFactory = new UserFactory();
	}
	
	protected void registerMethod(int opt, String m) {
		try {
			methods.put(new Integer(opt), 
					this.getClass().getDeclaredMethod(
							m, 
							User.class, 
							HttpServletRequest.class, 
							HttpServletResponse.class)
					);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	abstract void registerMethods();
	
	protected void echo404(HttpServletResponse res) {
		res.setStatus(404);
	}
	
	public void handle(
			int opt,
			String target, 
			HttpServletRequest request,
			HttpServletResponse response) {
		User u;
		String s;
		
		//u = Guest if user_token = null
		if (request.getHeader("user_token") == null)
			u = _userFactory.getUserByToken(request.getParameter("user_token"));
		else
			u = _userFactory.getUserByToken(request.getHeader("user_token"));
		
		Method m = methods.get(new Integer(opt));
		//no methods
		if (m == null)
			echo404(response);
		else
			try {
				m.invoke(this, u, request, response);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
	}
	
//	public void method(HttpServletRequest request)
	
}
