package tcpDemo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 10000);
		OutputStream os = socket.getOutputStream();
		os.write("中村さん、こんにちは".getBytes());
		os.close();
		socket.close();
	}

}
