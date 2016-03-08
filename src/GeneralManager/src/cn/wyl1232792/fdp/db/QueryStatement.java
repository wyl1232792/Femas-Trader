package cn.wyl1232792.fdp.db;

public class QueryStatement {
	String _sql;
	String _table;
	boolean multiWhere;
	boolean multiInsert;
	
	public QueryStatement(String table) {
		_table = table;
		_sql = "";
		multiWhere = false;
		multiInsert = false;
	}
		
	public String select(int num, int offset) {
		this.prepend("SELECT * FROM `"+ _table + '`');
		if (num > 0)
			this.append(" LIMIT " + num * (offset-1) + "," + num);
		return _sql;
	}
	
	public String selectOne() {
		return select(1, 1); 
	}
	
	public String Insert() {
		this.prepend("INSERT INTO `" + _table + '`');
		return _sql;
	}
	
	public QueryStatement columns(String sentence) {
		this.prepend(" " + sentence + " VALUES ");
		return this;
	}
	
	public QueryStatement addItem(String sentence) {
		this.append(((multiInsert) ? " ," : "") + sentence);
		multiInsert = true;
		return this;
	}
	
	public String InsertOne(DatabaseModel dm) {
		return this.columns(dm.generateColumns())
				.addItem(dm.generateItemSql())
				.Insert();
	}
	
	public QueryStatement where(String column, String opt, String value) {
		this.append(((multiWhere) ? (" and ") : (" WHERE ")) + column + " " + opt + " " + value);
		multiWhere = true;
		return this;
	}
	
	public QueryStatement whereString(String column, String opt, String value) {
		this.append(((multiWhere) ? (" and ") : (" WHERE ")) + column + " " + opt + " '" + value + "'");
		multiWhere = true;
		return this;
	}
	
	public String getSql() {
		return _sql;
	}
	
	public void append(String s) {
		_sql += s;
	}
	
	public void prepend(String s) {
		_sql = s + _sql;
	}
}
