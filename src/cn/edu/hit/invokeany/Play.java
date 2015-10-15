package cn.edu.hit.invokeany;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Play implements Callable<String>{

	private String name;
	
	public Play(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Random random = new Random();
		int number = random.nextInt();
		TimeUnit.SECONDS.sleep(number);
		return name;
	}
	
	 
}
