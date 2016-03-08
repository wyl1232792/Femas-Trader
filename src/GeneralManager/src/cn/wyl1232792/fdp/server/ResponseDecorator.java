package cn.wyl1232792.fdp.server;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

abstract public class ResponseDecorator {
	protected HttpServletResponse _response;
	Writer _writer;
	public ResponseDecorator(HttpServletResponse response) {
		_response = response;
		try {
			_writer = _response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addContent(String s) {
		try {
			_writer.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setStatusCode(int code) {
		_response.setStatus(code);
	}
}
