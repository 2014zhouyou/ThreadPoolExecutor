package cn.edu.hit;

import java.util.Date;

public class Task implements Runnable {

	private Date initDate;
	private String name;

	public Task(String name) {
		this.initDate = new Date();
		this.name = name;
	}

	public void run() {
		long duration = (long)Math.random();
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(initDate.getTime() + "Thread-name:" + name);
	}
}
