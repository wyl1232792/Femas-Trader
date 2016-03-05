package cn.wyl1232792.fdp.user;

import java.util.HashMap;
import java.util.Map;

import cn.wyl1232792.fdp.db.User;

public class UserFactory {
	//cache for avoiding too many instances of user model
	static Map<Integer, User> _users = new HashMap<Integer, User>();
	
	public static User getUserByToken(String user_token) {
		return null;
	}
	
	public static User getGuestUser() {
		return null;
	}
	
	public static User login(String username, String password) {
		
		return null;
	}
	
}
