package ex03;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 10000);
		
		String msg = "インペリアルスイート";
		OutputStream os = socket.getOutputStream();
		os.write(msg.getBytes());
		socket.shutdownOutput();
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		int b;
		while((b = isr.read()) != -1) {
			System.out.print((char)b);
		}
		
		socket.close();
	}

}
