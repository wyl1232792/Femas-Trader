package cn.wyl1232792.fdp.util;

class DailyMarketData extends CycledMarketData {
	
	public DailyMarketData() {
		type = 0;
		minutesPerCycle = 240;  
	}
	
	public DailyMarketData(int t) {
		type = t;
	}
}
