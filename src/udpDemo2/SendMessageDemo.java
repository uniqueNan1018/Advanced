package udpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
	public static void main(String[] args) throws IOException {
		MulticastSocket ms = new MulticastSocket();
		String str = "Hello!";
		byte[] bytes = str.getBytes();
		InetAddress address = InetAddress.getByName("224.0.0.1");
		int port = 10000;
		DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, address, port);
		ms.send(datagramPacket);
		ms.close();
	}
}
