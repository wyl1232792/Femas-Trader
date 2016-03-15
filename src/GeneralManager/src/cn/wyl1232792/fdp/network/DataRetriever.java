package cn.wyl1232792.fdp.network;

//one instance should be able to handle the whole mduser of CTP
abstract class DataRetriever {
	int _mode;
	public void setMode(int m) {
		_mode = m;
	} 
	DataRetriever() {  }
	abstract public void init();
	abstract public int checkStatus();
	abstract public void start();
	abstract public void reset();
	abstract public void close();
}
