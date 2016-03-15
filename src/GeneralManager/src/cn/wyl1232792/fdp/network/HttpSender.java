package cn.wyl1232792.fdp.network;

import java.nio.charset.Charset;
import java.util.function.Function;

import org.eclipse.jetty.client.HttpClient;
import org.json.JSONObject;

public class HttpSender {

	HttpClient _httpClient;
	public HttpSender() {
		_httpClient = new HttpClient();
	}
	
	public void sendSimpleRequest(String url, String method, String params, Function<String, Void> callback) {
		try {
			_httpClient.start();
			_httpClient.newRequest(url)
				.onResponseContent((response, buffer) -> {
					callback.apply(Charset.forName("utf-8").decode(buffer).toString());
				})
				.send((result) -> {
					if (result.isFailed())
						//To be rewritten when error handling class built
						System.out.println("Error");
				});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getJson(String url, String method, String params, Function<JSONObject, Void> callback) {
		sendSimpleRequest(url, method, params, (str) -> {
			JSONObject jo = new JSONObject(str);
			callback.apply(jo);
			return null;
		});
	}


}
