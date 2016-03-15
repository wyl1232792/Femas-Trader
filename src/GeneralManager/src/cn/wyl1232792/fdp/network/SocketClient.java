package cn.wyl1232792.fdp.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
	Socket _socket;
	PrintWriter out;
	BufferedReader in;
	SocketHandler _handler;
	
	boolean _isValid = true;

	public SocketClient(String target, int port) {
		try {
			_socket = new Socket(target, port);
			out = new PrintWriter(_socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(_socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			_isValid = false;
			e.printStackTrace();
		}
	}

	public boolean isValid() { return _isValid; }
	
	public void setHandler(SocketHandler sh){
			_handler = sh;
	}
	
	//async
	public void startReading() throws IOException {
		int mode = 0;
		String txt = "";
		while ((txt =in.readLine()) != "")
			mode = _handler.handle(txt, mode);
	}
	
	//sync
	public String readLine() throws IOException {
		return in.readLine();
	}
	
}
