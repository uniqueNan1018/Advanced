package ex01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		String str = "こんにちは！";
		byte[] bytes = str.getBytes();
		InetAddress addr = InetAddress.getByName("127.0.0.1"); 
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length, addr, port);
		ds.send(dp);
		ds.close();
	}

}
