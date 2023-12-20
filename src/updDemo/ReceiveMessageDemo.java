package updDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);
		byte[] bytes = new byte[1024];
		
		while(true) {
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
			ds.receive(dp);
			
			byte[] data = dp.getData();
			int len = dp.getLength();
			String ip = dp.getAddress().getHostAddress();
			String hostname = dp.getAddress().getHostName();
			System.out.println("ip=" + ip + ", hostname=" + hostname + ", msg=" + new String(data, 0, len));
		}
	}

}
