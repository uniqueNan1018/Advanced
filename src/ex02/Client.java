package ex02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 10000);
		Scanner sc = new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		
		while(true) {
			System.out.println("メッセージを入力してください");
			String msg = sc.nextLine();
			if ("0".equals(msg)) {
				break;
			}
			os.write(msg.getBytes());
		}
		
		os.close();
		socket.close();
	}

}
