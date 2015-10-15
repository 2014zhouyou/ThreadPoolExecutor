package cn.edu.hit;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			Task t = new Task(String.valueOf(i));
			//System.out.println(tpe.getPoolSize());
			System.out.println(tpe.getActiveCount());
			tpe.execute(t);
		}
		System.out.println(tpe.isShutdown());
		tpe.shutdown();
		System.out.println(tpe.isShutdown());
		System.out.println(tpe.isTerminated());
		
	}
}
