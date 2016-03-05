package cn.wyl1232792.fdp.user;

public class Auth {
	public final static int GROUP_ADMIN = 0;
	public final static int GROUP_INVESTOR = 1;
	public final static int GROUP_USER = 2;
	public final static int GROUP_GUEST = 3;
	
	public final static int OPT_LOGIN = 0;
	//TO be completed
	
	int _group;
	boolean loginFailed;
	String error_msg;
		
	public Auth(String user_token) {
	}
	
	public Auth(String username, String password) {
	}
	
	public boolean authenicationFromToken(String user_token) {
		//Check user_token
		return false;
	}
	
	public boolean authenicationFromLogin(String username, String password) {
		return false;
		
	}
	
	public int getGroup() {
		return _group;
	}
	
	public boolean check() {
		return !loginFailed;
	}
	
	public String getErrorMsg() {
		return error_msg;
	}
}
