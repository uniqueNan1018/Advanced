package threadDemo04;

public class MyThread extends Thread {
	static int ticket = 0;
//	static Object obj = new Object();
	
	@Override
	public void run() {
		while (true) {
			synchronized (MyThread.class) {
				if (ticket < 100) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
					ticket++;
					System.out.println(getName() + "は" + ticket + "番のチケットを売っている");
				} else {
					break;
				}
			}
			
			
		}
	}

}
