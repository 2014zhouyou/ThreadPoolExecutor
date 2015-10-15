package cn.edu.hit.cancle;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

	@Override
	public String call() throws Exception {
		while (true) {
			System.out.println("I am zhouyou");
			Thread.sleep(1000);
		}
	}

}
