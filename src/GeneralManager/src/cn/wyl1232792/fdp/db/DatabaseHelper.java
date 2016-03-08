package cn.wyl1232792.fdp.db;

import java.sql.*;

abstract public class DatabaseHelper implements DatabaseHandler {

	protected Connection _connection;
	
	public DatabaseHelper() {
		init();
	}
	
	public ResultSet simpleQuery(String sql) throws SQLException {
		Statement statement = _connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		return statement.executeQuery(sql);
	}
	
	public boolean executeQuery(String sql) throws SQLException {
		Statement statement = _connection.createStatement();
		boolean flag = statement.execute(sql);
		statement.close();
		return flag;
	}
	
}
