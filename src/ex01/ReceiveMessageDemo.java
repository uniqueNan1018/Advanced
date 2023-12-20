package ex01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ds.receive(dp);
		
		byte[] data = dp.getData();
		int len = dp.getLength();
		InetAddress address = dp.getAddress();
		int p = dp.getPort();
		System.out.println("data: " + new String(data, 0, len));
		System.out.println("address: " + address);
		System.out.println("port: " + p);
		
		ds.close();
		
	}

}
