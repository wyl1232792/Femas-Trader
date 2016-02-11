package cn.wyl1232792.fdp.util;
import java.util.Queue;

class DepthMarketDataQueue {
	private Queue<DepthMarketData> dmds;
	private int len;
	private int maxLen;
	
	public DepthMarketDataQueue() {
		this(500);
	}

	public DepthMarketDataQueue(int ml) {
		len = 0;
		maxLen = ml;
	}
	
	public boolean insert(DepthMarketData d) {
		len++;
		return dmds.offer(d);
	}
	
	public DepthMarketData poll() {
		len--;
		return dmds.poll();
	}
	
	public boolean isEmpty() {
		return dmds.isEmpty();
	}
	
	public boolean needClear() {
		return (len > maxLen);
	}
}
