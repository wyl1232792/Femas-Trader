package cn.wyl1232792.fdp.thread;


public class ThreadFactory {
	
	
	public Thread createThread(Runnable r) {
		return new Thread(r);
	}
	
}
