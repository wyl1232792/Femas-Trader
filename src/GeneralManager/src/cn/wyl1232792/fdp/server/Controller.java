package cn.wyl1232792.fdp.server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.user.UserFactory;

abstract public class Controller {

	Map<Integer, Method> methods;
	
	public Controller() {
		methods = new HashMap<Integer, Method>();
		registerMethods();
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
		
		//no user_token
		if ((s = request.getHeader("user_token")) == null)
			u = UserFactory.getGuestUser();
		else
			u = UserFactory.getUserByToken(s);
		
		Method m = methods.get(new Integer(opt));
		//no methods
		if (m == null)
			echo404(response);
		else
			try {
				m.invoke(this.getClass(), u, request, response);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
	}
	
//	public void method(HttpServletRequest request)
	
}
