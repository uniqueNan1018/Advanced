package threadDemo02;

public class ThreadDemo {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "電車");
		Thread t2 = new Thread(mr, "飛行機");
//		int t1p = t1.getPriority();
//		System.out.println("電車のプライオリティは" + t1p);
//		int t2p = t2.getPriority();
//		System.out.println("飛行機のプライオリティは" + t2p);
		
//		System.out.println("メインスレッドのプライオリティは" + Thread.currentThread().getPriority());
	
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
