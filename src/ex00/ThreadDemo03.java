package ex00;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable mc = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<>(mc);
		Thread t1 = new Thread(ft);
		t1.start();
		System.out.println(ft.get());
	}

}
