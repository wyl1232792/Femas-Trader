package JettyHttpRequest;

public class JettyHttpRequest {
	HttpClient client =new HttpClient();
	
	
	//这几句？有人加有人不加╮(╯_╰)╭
	client.setConnectorType(HttpClient.CONNECTOR_SELECT_CHANNEL);
	client.setMaxConnectionsPerAddress(10);
	client.setTimeout(5000);
	client.start();
	
	try{
		client.start();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	ContentExchange exchange=new ContentExchange(){
		protected void onResponseComplete() throws IOException{
			if(getResponseStatus()==200){
				String content =getResponseContent();
				System.out.println(content);
			}
		}
		
		protected void onExpire(){
			System.out.println("time out");
		}
	}
	exchange.setMethod("GET");
	exchange.setURL("blablablablablablablablab");
	try{
		client.send(exchange);
	}catch(IOException e){
		e.printStackTrace();
	}
	
	
}
