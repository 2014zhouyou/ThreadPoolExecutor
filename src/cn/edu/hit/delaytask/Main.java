package cn.edu.hit.delaytask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor stp = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(5);
		Task t = new Task("I am 4");
		long start = System.currentTimeMillis();
		stp.schedule(t,	5, TimeUnit.SECONDS);
		stp.awaitTermination(4, TimeUnit.SECONDS);
		long end = System.currentTimeMillis();
		long last = end - start;
		System.out.println(TimeUnit.SECONDS.convert(last, TimeUnit.MILLISECONDS));
		
		stp.shutdown();
	}
}
