package cn.edu.hit.invokeall;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
			List<Future<String>> result = (List<Future<String>>) tpe.invokeAll(playList);
			List<Future<String>> temp = new ArrayList<Future<String>>();
			while (!result.isEmpty()) {
				temp.addAll(result);
				for (Future<String> r: result) {
					if (r.isDone()) {
						String name = r.get();
						System.out.println(name);
					}
					temp.remove(r);
				}
				result.clear();
				result.addAll(temp);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		tpe.shutdown();
	}
}
