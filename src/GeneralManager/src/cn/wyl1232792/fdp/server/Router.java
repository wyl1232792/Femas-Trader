package cn.wyl1232792.fdp.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class Router extends AbstractHandler {
	
	Map<String, Controller> controllers;
	
	public Router() {
		controllers = new HashMap<String, Controller>();
		this.registerControllers();
	}
	
	private void registerControllers() {
		registerController("/test", new TestController());
		registerController("/user", new UserController());
	}
	
	private void registerController(String name, Controller c) {
		controllers.put(name, c);
	}
	

	@Override
	public void handle(String target,
			Request baseRequest,
			HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		if (controllers.get(target) == null || request.getParameter("opt") == null)
			response.setStatus(404);
		else	
			controllers.get(target).handle(Integer.parseInt(request.getParameter("opt")), target, request, response);
		baseRequest.setHandled(true);
	}
	
}
