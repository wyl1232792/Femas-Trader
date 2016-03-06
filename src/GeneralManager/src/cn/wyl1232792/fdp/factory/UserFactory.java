package cn.wyl1232792.fdp.factory;

import java.util.HashMap;
import java.util.Map;

import cn.wyl1232792.fdp.db.User;

public class UserFactory extends DBFactory {
	//cache for avoiding too many instances of user model
	Map<Integer, User> _users = new HashMap<Integer, User>();

	public UserFactory() {
		super();
		setTable("users");
	}
	
	public User newUser() {
		return new User();
	}
	
	public User getUserByToken(String user_token) {
		return null;
	}
	
	public User getGuestUser() {
		return new User();
	}
	
	public User login(String username, String password) {
		return null;
	}
	
}
