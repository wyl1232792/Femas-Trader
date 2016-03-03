package cn.wyl1232792.fdp;

import cn.wyl1232792.fdp.server.*;

public class FinancialDataPlatform {

	public static void main(String[] args) {
		InsideHttpServer ihs = new InsideHttpServer(8080, new Reciever());
		try {
			ihs.init();
			ihs.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
