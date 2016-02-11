package cn.wyl1232792.fdp.util;
import java.util.Date;

/*
 * 
 * 
*/
class DepthMarketData {
	
	int type;
	
	public Date updateTime;
	public CosTime time;
	public CosDate date;
	public float preSettlementPrice;
	public float preClosePrice;
	public int preOpenInterest;
	public float preDelta;
	public float openPrice;
	public float highestPrice;
	public float lowestPrice;
	public float closePrice;
	public float upperLimitPrice;
	public float lowerLimitPrice;
	public float SettlementPrice;
	public float currDelta;
	public float lastPrice;
	public int volume;
	public int turnover;
	public int openInterest;
	public String instrumentID;
	
	public DepthMarketData() {
		
	}
}
