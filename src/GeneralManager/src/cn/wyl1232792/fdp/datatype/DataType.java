package cn.wyl1232792.fdp.datatype;

abstract class DataType {
	
	private Object data;
	private Object columns;
	private Object line;
	protected boolean initialized = false;
	
	void setData(Object d) { initialized = true; data = d; }
	Object getData() { return data; }

	void setColumns(Object c) { columns = c; }
	Object getColumns() { return columns; }
	void setLine(Object l) { line = l; }
	Object getLine() { return line; }
	
	abstract void update(Object input);
	
}
