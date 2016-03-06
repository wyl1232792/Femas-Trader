package cn.wyl1232792.fdp.db;

import java.sql.*;

import cn.wyl1232792.fdp.lang.SystemConfig;

public class MysqlHelper extends DatabaseHelper {

	@Override
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			_connection = DriverManager.getConnection(SystemConfig.DB_URI);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
