package cn.wyl1232792.fdp.db;

import java.sql.*;

abstract public class DatabaseModel {
	abstract public boolean readFromResultSet(ResultSet rs);
	abstract public String generateJsonString();
	abstract public String generateInsertSql();
	abstract public String generateColumns();
	abstract public String generateItemSql();
	abstract public String generateUpdateSql();
	abstract public boolean readFromJson(String str);
	
	public void save() {
		
	}
}
