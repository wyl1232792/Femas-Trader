package cn.wyl1232792.fdp.server;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyl1232792.fdp.db.User;

public class TestController extends Controller {
	public static final int OPT_TEST = 2333;
	@Override
	void registerMethods() {
		registerMethod(OPT_TEST, "testMethod");
	}
	
	public void testMethod(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JsonApi ja = new JsonApi(response);
		ja.echoResult("Hello World!!");
	}

}
