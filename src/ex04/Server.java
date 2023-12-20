package ex04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10000);
		Socket socket = ss.accept();

//		FileInputStream
		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("/Users/zhengnan/Documents/schoolSystem2/Advanced/serverdir/WX20231203-001130@2x.png"));
		int len;
		byte[] bytes = new byte[1024];
		while((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("ファイルを保存しました");
		bw.newLine();
		bw.flush();
		
		socket.close();
		
		
	}
}
