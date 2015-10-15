package cn.edu.hit.cycletask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
		Task t = new Task("zhouyou");
		ses.scheduleAtFixedRate(t, 1, 3, TimeUnit.SECONDS);
		((ScheduledThreadPoolExecutor)ses).setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
		ses.shutdown();
 	}
}
