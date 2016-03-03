package cn.wyl1232792.fdp.network;

abstract class DataRetriever {
	int _mode;
	public void setMode(int m) {
		_mode = m;
	}
	DataRetriever() {  }
	abstract public void start();
	abstract public void reset();
	abstract public void close();
}
