package cn.edu.hit.rejecttask;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		tpe.setRejectedExecutionHandler(new RejectController());
		
		Task t = new Task("can be execute");
		tpe.execute(t);
		
		tpe.shutdown();
	    Task t2 = new Task("cannot be executor");
	    tpe.execute(t2);
	    
	}

}
