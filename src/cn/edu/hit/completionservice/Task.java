package cn.edu.hit.completionservice;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task implements Callable<String> {
	
	private String name;
	
	public Task(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "NAME" + name;
	}
}
