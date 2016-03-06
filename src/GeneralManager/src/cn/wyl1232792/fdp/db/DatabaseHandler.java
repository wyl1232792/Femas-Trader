package cn.wyl1232792.fdp.db;

import java.sql.ResultSet;
import java.sql.SQLException;

interface DatabaseHandler {
	abstract public void init();
	abstract public ResultSet simpleQuery(String sql) throws SQLException ;
}
