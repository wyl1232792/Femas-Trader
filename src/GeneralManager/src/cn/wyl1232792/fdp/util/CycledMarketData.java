package cn.wyl1232792.fdp.util;


class CycledMarketData {
	int minutesPerCycle;
	int type;
	boolean initialized = false;
	
	public float highestPrice, lowestPrice;
	public int position;
	public float firstPrice, lastPrice;
	public float avgPrice;
	public int firstVolume, lastVolume;
	
	public CycledMarketData() {}
	
	public void insert(DepthMarketData dmd) {
	}
}
