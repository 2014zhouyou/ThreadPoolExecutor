package cn.edu.hit.rejecttask;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectController implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		Task t = (Task) r;
		System.out.println(t.getName() + " : Handler reject task....");
	}
}
