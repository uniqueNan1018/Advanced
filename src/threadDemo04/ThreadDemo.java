package threadDemo04;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("窓口1");
		t2.setName("窓口2");
		t3.setName("窓口3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
