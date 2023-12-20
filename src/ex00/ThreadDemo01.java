package ex00;

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("スレッド1");
		MyThread t2 = new MyThread();
		t2.setName("スレッド2");
		
		t1.start();
		t2.start();
	}
}
