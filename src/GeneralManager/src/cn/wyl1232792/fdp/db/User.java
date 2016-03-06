
package cn.wyl1232792.fdp.db;

import java.sql.ResultSet;

import cn.wyl1232792.fdp.user.Auth;

public class User extends DatabaseModel {

	int _id;
	String _username;
	String _password;
	Auth _auth;
	
	public User() {
		//produce guest user
		_id = 0;
		_username = "guest";
		_password = "";
		_auth = new Auth(null);
	}
	
	@Override
	public boolean readFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String generateJsonString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generateInsertSql() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generateUpdateSql() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean readFromJson(String str) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int getUserGroup() {
		return _auth.getGroup();
	}
	public String getUsername() {
		return _username;
	}

	public void setUsername(String _username) {
		this._username = _username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String _password) {
		this._password = _password;
	}

	@Override
	public String generateColumns() {
		return "(`username`, `password`)";
	}

	@Override
	public String generateItemSql() {
		return "('" + _username + "', '" + _password + "')";
	}
}
