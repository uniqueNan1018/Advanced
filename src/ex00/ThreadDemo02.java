package ex00;

public class ThreadDemo02 {

	public static void main(String[] args) {
		MyRun myrun = new MyRun();
		Thread t1 = new Thread(myrun);
		t1.setName("スレッド1");
		Thread t2 = new Thread(myrun);
		t2.setName("スレッド2");
		
		t1.start();
		t2.start();
	}

}
