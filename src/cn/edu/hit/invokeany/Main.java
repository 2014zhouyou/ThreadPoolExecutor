package cn.edu.hit.invokeany;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		
		List<Play> playList = new ArrayList<Play>();
		for (int i = 0; i < 10; i++) {
			Play p = new Play("Thread-" + i);
			playList.add(p);
		}
		
		try {
			String result = (String) tpe.invokeAny(playList);
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		tpe.shutdown();
	}
}
