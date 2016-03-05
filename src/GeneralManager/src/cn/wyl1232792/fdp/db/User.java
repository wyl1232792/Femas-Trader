
package cn.wyl1232792.fdp.db;

import java.sql.ResultSet;

import cn.wyl1232792.fdp.user.Auth;

public class User implements DatabaseModel {
	int _id;
	String _username;
	String _password;
	Auth _auth;
	
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
}
