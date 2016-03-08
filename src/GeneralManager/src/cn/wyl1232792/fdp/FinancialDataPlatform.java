package cn.wyl1232792.fdp;

import cn.wyl1232792.fdp.db.DatabaseHelper;
import cn.wyl1232792.fdp.db.MysqlHelper;
import cn.wyl1232792.fdp.db.User;
import cn.wyl1232792.fdp.factory.UserFactory;
import cn.wyl1232792.fdp.lang.SystemConfig;
import cn.wyl1232792.fdp.server.InsideHttpServer;


public class FinancialDataPlatform {

	public static InsideHttpServer ihs = new InsideHttpServer(SystemConfig.HTTP_SERVER_PORT, null);
	public static DatabaseHelper dh = new MysqlHelper();
	public static UserFactory uf = new UserFactory();
	
	
	public static void main(String[] args) {
		try {
			ihs.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
