package cn.wyl1232792.fdp.factory;

import java.util.HashMap;
import java.util.Map;
import cn.wyl1232792.fdp.db.*;

import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.util.Encrypt;

public class UserFactory extends DBFactory {
	//cache for avoiding too many instances of user model
	Map<Integer, User> _users = new HashMap<Integer, User>();

	public UserFactory() {
		super();
		setTable("users");
	}
	
	public User newUser(int group) {
		return new User();
	}
	
	public User getUserByToken(String user_token) {
		return new User(user_token);
	}
	
	public User getGuestUser() {
		return new User(User.GROUP_GUEST);
	}
	
	public User login(String username, String password) {
		User user = new User();
		user.authenicationFromLogin(username, Encrypt.md5(password));
		return user;
	}
	
}
