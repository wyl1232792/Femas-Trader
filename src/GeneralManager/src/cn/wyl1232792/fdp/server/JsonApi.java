package cn.wyl1232792.fdp.server;

import javax.servlet.http.HttpServletResponse;

import org.json.*;


public class JsonApi extends ResponseDecorator {

	JSONObject _json;
	
	public JsonApi(HttpServletResponse response) {
		super(response);
		_json = new JSONObject();
		response.setContentType("application/json");
	}

	public JSONObject getJSON() {
		return _json;
	}
	
	public void putErrorMessage(int code, String msg) {
		_json.put("error_code", code);
		_json.put("error_msg", msg);
	}

	public void write() {
		addContent(_json.toString());
	}
	
	public void echoResult(JSONArray ja) {
		setSuccess(200);
		_json.put("result", ja);
		write();
	}
	
	public void echoResult(int r) {
		setSuccess(200);
		_json.put("result", r);
		write();
	}
	public void echoResult(String r) {
		setSuccess(200);
		_json.put("result", r);
		write();
	}
	
	public void echoResult(JSONObject jo) {
		setSuccess(200);
		_json.put("result", jo);
		write();
	}
	
	public void echoError(int statusCode, int errorCode, String msg) {
		setStatusCode(statusCode);
		putErrorMessage(errorCode, msg);
		write();
	}
	
	public void setSuccess(int code) {
		putErrorMessage(0, "");
		setStatusCode(code);
	}
	
}
