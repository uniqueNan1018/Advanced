package updDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("メッセージを入力してください");
			String msg = scan.nextLine();
			if ("886".equals(msg)) {
				break;
			}
			byte[] bytes = msg.getBytes();
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			int port = 10086;
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, addr, port);
			ds.send(dp);
		}
		ds.close();
	}

}
