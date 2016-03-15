package cn.wyl1232792.fdp.network;

import java.nio.charset.Charset;
import java.util.function.Function;

import org.eclipse.jetty.client.HttpClient;
import org.json.JSONObject;

class WebApiDataRetriever extends SyncDataRetriever {
	/*
	 * _mode:
	 * 	0 -> only capable for sending simple request
	 *  1 -> a request will be removed after being sent successfully
	 *  2 -> requests in the QUEUE will always exist
	 */
	
	Thread _mainTr;
	int _interval;
	boolean _stopThread;
	

	
	WebApiDataRetriever() {
		_interval = 0;
		_stopThread = true;
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

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int checkStatus() {
		// TODO Auto-generated method stub
		return 0;
	}
}
