package cn.wyl1232792.fdp;
import java.nio.charset.Charset;

import org.eclipse.jetty.client.HttpClient;
public class FinancialDataPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpClient httpClient = new HttpClient();
		try {
			httpClient.start();
			httpClient.newRequest("http://www.baidu.com")
				.onResponseContent((response, buffer) -> {
					
					System.out.println(Charset.forName("utf-8").decode(buffer).toString());
				})
				.send((result) -> {
					if (result.isFailed())
						System.out.println("failed");
				});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("running");
	}

}
