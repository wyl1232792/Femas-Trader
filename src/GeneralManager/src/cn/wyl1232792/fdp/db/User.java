
package cn.wyl1232792.fdp.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONObject;

import cn.wyl1232792.fdp.FinancialDataPlatform;
import cn.wyl1232792.fdp.factory.UserFactory;
import cn.wyl1232792.fdp.util.Encrypt;

public class User extends DatabaseModel {
	public final static int GROUP_ADMIN = 0;
	public final static int GROUP_INVESTOR = 1;
	public final static int GROUP_USER = 2;
	public final static int GROUP_GUEST = 3;
	
	public final static int LOGIN_NONE = 0;
	public final static int LOGIN_SUCCESS = 1;
	public final static int LOGIN_FAILED = 2;
	public final static int LOGIN_ERROR = 3;
	
	
	public final UserFactory _userFactory = FinancialDataPlatform.uf;
	public final DatabaseHelper _databaseHelper = FinancialDataPlatform.dh;

	int _id;
	String _username;
	String _password;
	String _token;
	int _group;
	int _loginStatus;
	String error_msg;
	
	public User() {
		//produce guest user
		this(GROUP_USER);
	}
	
	public User(int x) {
		_loginStatus = 0;
		_id = 0;
		_username = "user";
		_password = "";
		_group = x;
	}
	
	public User(String token) {
		//for authenication
		this(GROUP_GUEST);
		if (token == null)
			return;
		authenicationFromToken(token);
	}
	
	@Override
	public boolean readFromResultSet(ResultSet rs) {
		try {
			if (rs.next()){
				_id = rs.getInt("id");
				_username = rs.getString("username");
				_password = rs.getString("password");
				_group = rs.getInt("group");
				_token = rs.getString("user_token");
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
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
		return _group;
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
		return "(`username`, `password`, `group`)";
	}

	@Override
	public String generateItemSql() {
		return "('" + _username + "', '" + _password + "'" + "," + _group + ")";
	}
	
	public boolean authenicationFromToken(String user_token) {
		//Check user_token
		try {
			ResultSet rs = _databaseHelper.simpleQuery(
				_userFactory.query()
					.whereString("user_token", "=", user_token)
					.selectOne());
			if (readFromResultSet(rs))
				setStatus(LOGIN_SUCCESS);
			else
				setStatus(LOGIN_FAILED);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			setStatus(LOGIN_ERROR);
		}
		return (getStatus() == LOGIN_SUCCESS);
	}
	
	public boolean authenicationFromLogin(String username, String password) {
		try {
			ResultSet rs = _databaseHelper.simpleQuery(
				_userFactory.query()
					.whereString("username", "=", username)
					.whereString("password", "=", password)
					.selectOne());
			if (readFromResultSet(rs)) {
				rs.updateString("user_token", _token = generateToken());
				rs.updateRow();
				setStatus(LOGIN_SUCCESS);
			} else 
				setStatus(LOGIN_FAILED);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			setStatus(LOGIN_ERROR);
		}
		return (getStatus() == LOGIN_SUCCESS);
	}
	
	public String generateToken() {
		return Encrypt.md5(_username + _password + System.currentTimeMillis());
	}
	
	public int getId() {
		return _id;
	}
	
	public int getGroup() {
		return _group;
	}
	
	public boolean check() {
		return false;
	}
	
	public String getErrorMsg() {
		return error_msg;
	}
	
	public int getStatus() { return _loginStatus; }
	public void setStatus(int status) {
		_loginStatus = status;
	}
	public String getToken() {
		return _token;
	}
	@Override
	public JSONObject generateJsonObject() {
		return new JSONObject().put("username", _username)
			.put("group", _group)
			.put("token", _token)
			.put("id", _id);
	}
	
}
