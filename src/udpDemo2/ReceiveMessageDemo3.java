package udpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo3 {
	public static void main(String[] args) throws IOException {
		MulticastSocket ms = new MulticastSocket(10000);
		InetAddress addr = InetAddress.getByName("224.0.0.2");
		ms.joinGroup(addr);
		
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ms.receive(dp);
		
		byte[] data = dp.getData();
		int len = dp.getLength();
		String ip = dp.getAddress().getHostAddress();
		String hostname = dp.getAddress().getHostName();
		System.out.println("ip=" + ip + ", hostname=" + hostname + ", msg=" + new String(data, 0, len));
		
		ms.close();
	}
}
