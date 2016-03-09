package cn.wyl1232792.fdp.network;

import java.nio.charset.Charset;
import java.util.function.Function;

import org.eclipse.jetty.client.HttpClient;
import org.json.JSONObject;

class WebApiDataRetriever extends DataRetriever {
	/*
	 * _mode:
	 * 	0 -> only capable for sending simple request
	 *  1 -> a request will be removed after being sent successfully
	 *  2 -> requests in the QUEUE will always exist
	 */
	
	HttpClient _httpClient;
	Thread _mainTr;
	int _interval;
	boolean _stopThread;
	

	
	WebApiDataRetriever() {
		_httpClient = new HttpClient();
		_interval = 0;
		_stopThread = true;
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

	public void configClient() {
		
	}
	
	public void start(int mode, int millionsec) {
		if (mode == 0)
			return;
		_mainTr = new Thread(() -> {
			while (true) {
				//TODO: wait for some seconds
				//TODO: send requests
				//TODO: generate bodys
				
			}
		});
		_mainTr.run();
	}

	@Override
	public void reset() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void start() {
		start(_mode, _interval);
	}
}
