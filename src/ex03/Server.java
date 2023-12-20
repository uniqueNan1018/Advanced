package ex03;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10000);
		
		Socket socket = ss.accept();
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		
		int b;
		while((b = isr.read()) != -1) {
			System.out.print((char)b);
		}
		
		String res = "分かりました！";
		OutputStream os = socket.getOutputStream();
		os.write(res.getBytes());
		
		socket.close();
		ss.close();
	}
}
