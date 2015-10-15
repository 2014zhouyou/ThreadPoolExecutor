package cn.edu.hit.futuretask;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		MyTask mt = new MyTask(new Task("zhouyou"));
		tpe.submit(mt);
		tpe.shutdown();
	}
}
