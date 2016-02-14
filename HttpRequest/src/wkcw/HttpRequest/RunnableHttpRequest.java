package wkcw.HttpRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RunnableHttpRequest implements Runnable{
	private String result;
	public void run(){
		try {
			URL url= new URL("");
			URLConnection connection=url.openConnection();
			InputStream is =connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
			
			String line;
			StringBuilder builder =new StringBuilder();
			while((line=br.readLine())!=null){
				builder.append(line);
			}
			br.close();
			isr.close();
			is.close();
			
			result=builder.toString();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getResult(){
		return result;
	}
}
