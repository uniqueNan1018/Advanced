package threadDemo03;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		
		t1.setName("ウェヌス");
		t2.setName("キープ");
		
//		t2.setDaemon(true);
		
		t1.start();
		t2.start();
	}

}
