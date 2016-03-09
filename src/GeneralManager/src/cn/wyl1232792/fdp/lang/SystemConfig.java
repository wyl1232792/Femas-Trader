package cn.wyl1232792.fdp.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.JSONStringer;

public class SystemConfig {
	public static String path = "config.json";
	
	public static String DB_DRIVER = "mysql";
	public static String DB_URI = "jdbc:mysql://localhost:3306/fd_platform?user=root&password=";
	
	public static int SOCKET_SERVER_PORT = 23333;
	public static int HTTP_SERVER_PORT = 2333;
	
	public static void readFromJson() {
        File file = new File(path);
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
            
            JSONObject jo = new JSONObject(buffer.toString());

    		DB_DRIVER = jo.getString("Database");
    		DB_URI = jo.getString("DatabaseUrl");
    		SOCKET_SERVER_PORT = jo.getInt("SocketServerPort");
    		HTTP_SERVER_PORT = jo.getInt("HttpServerPort");
 
        } catch (FileNotFoundException e) {
        	System.out.println("File not Found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
	}
	
	public static void write() {
		JSONStringer js = new JSONStringer();
		js.object();
		js.key("Database").value(DB_DRIVER);
		js.key("DatabaseUrl").value(DB_URI);
		js.key("SocketServerPort").value(SOCKET_SERVER_PORT);
		js.key("HttpServerPort").value(HTTP_SERVER_PORT);
		js.endObject();
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileOutputStream(path));
	        out.println(js.toString()); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} finally {
			out.close();
		}
	}
}
