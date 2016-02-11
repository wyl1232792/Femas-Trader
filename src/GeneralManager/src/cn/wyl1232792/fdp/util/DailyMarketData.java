package cn.wyl1232792.fdp.util;

class DailyMarketData extends CycledMarketData {
	
	public DailyMarketData() {
		this(Codes.TYPE_STOCK);
	}
	
	public DailyMarketData(int t) {
		type = t;
		minutesPerCycle = 240;
	}
}
