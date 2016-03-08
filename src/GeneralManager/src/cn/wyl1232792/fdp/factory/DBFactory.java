package cn.wyl1232792.fdp.factory;

import java.sql.SQLException;

import cn.wyl1232792.fdp.FinancialDataPlatform;
import cn.wyl1232792.fdp.db.DatabaseHelper;
import cn.wyl1232792.fdp.db.DatabaseModel;
import cn.wyl1232792.fdp.db.QueryStatement;

public class DBFactory {

	protected String _table;
	protected DatabaseHelper _databaseHelper;
	public DBFactory() {
		_table = "";
		_databaseHelper = FinancialDataPlatform.dh;
	}
		
	public QueryStatement query() {
		return new QueryStatement(this._table);
	}
	public QueryStatement sql() {
		return new QueryStatement(this._table);
	}
	
	public void setTable(String name) {
		_table = name;
	}
	
	public boolean create(DatabaseModel dm) {		
		String sql = new QueryStatement(this._table).InsertOne(dm);
		boolean flag = false;
		try {
			_databaseHelper.executeQuery(sql);
			return true;
		} catch (SQLException e) {
			flag = false;
		}
		return flag;
	}
	
}
