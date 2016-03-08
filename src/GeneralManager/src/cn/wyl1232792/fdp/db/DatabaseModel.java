package cn.wyl1232792.fdp.db;

import java.sql.*;

import org.json.JSONObject;

abstract public class DatabaseModel {
	QueryStatement _statement;
	
	abstract public boolean readFromResultSet(ResultSet rs);
	abstract public String generateJsonString();
	abstract public String generateInsertSql();
	abstract public String generateColumns();
	abstract public String generateItemSql();
	abstract public String generateUpdateSql();
	abstract public JSONObject generateJsonObject();
	abstract public boolean readFromJson(String str);
	
	
	
	public void save() {
		
	}
}
