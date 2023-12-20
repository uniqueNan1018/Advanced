package mySocketInet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("192.168.1.104");
			System.out.println(address);
			
		} catch (UnknownHostException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
