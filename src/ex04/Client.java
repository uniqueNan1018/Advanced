package ex04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 10000);

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"/Users/zhengnan/Documents/schoolSystem2/Advanced/clientdir/WX20231203-001130@2x.png"));
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

		byte[] bytes = new byte[1024];
		int len;
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}
		socket.shutdownOutput();

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = br.readLine();
		System.out.println(line);
		socket.close();
	}

}
