package cn.wyl1232792.fdp.server;


abstract class InsideServer {
	public InsideServer() {}
	public void init() {}
	private Runnable main;
	public void setRunnable(Runnable r) {
		main = r;
	}
	public void callBack() {
		main.run();
	}
}
