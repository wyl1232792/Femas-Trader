package cn.wyl1232792.fdp.server;

public class Reciever {
	
//	CommandFactory commander;
	
	public Reciever() {
		
	}
	
	public void recieve(String cmd) {
		if (cmd == null)
			return;
		System.out.println(cmd);
	}
}
