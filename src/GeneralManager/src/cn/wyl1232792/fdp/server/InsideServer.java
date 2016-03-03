package cn.wyl1232792.fdp.server;


abstract class InsideServer{
	Reciever _reciever;
	public InsideServer(Reciever r) {
		_reciever = r;
	}
	public String latestContext() { return null; }
	abstract public void init() throws Exception;
	abstract public void close();
	abstract public void restart();
	abstract public void clearWorks();
	public void callback() {
		_reciever.recieve(null);
	}
}
