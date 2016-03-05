package cn.wyl1232792.fdp.db;

import java.sql.*;

interface DatabaseModel {
	abstract public boolean readFromResultSet(ResultSet rs);
	abstract public String generateJsonString();
	abstract public String generateInsertSql();
	abstract public String generateUpdateSql();
	abstract public boolean readFromJson(String str);
}
