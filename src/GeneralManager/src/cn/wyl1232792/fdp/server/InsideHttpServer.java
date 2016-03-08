package cn.wyl1232792.fdp.server;

import org.eclipse.jetty.server.Server;

public class InsideHttpServer extends InsideServer {
	int port;
	Server _server;
	public InsideHttpServer(int p, Reciever r) {
		super(r);
		_server = new Server(port = p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws Exception {
		_server.setHandler(new Router());
		_server.start();
		_server.dumpStdErr();
	}

	public void join() throws InterruptedException {
		_server.join();
	}
	
	@Override
	public void close() {
		try {
			_server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearWorks() {
		// TODO Auto-generated method stub
		
	}

}
