package cn.edu.hit.cancle;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		Task t = new Task();
		Future<String> r = (Future<String>) tpe.submit(t);
		TimeUnit.SECONDS.sleep(5);
		System.out.println("going to cancle");
		r.cancel(true);
		System.out.println(r.isCancelled());
		System.out.println(r.isDone());
		tpe.shutdown();
	}
}
