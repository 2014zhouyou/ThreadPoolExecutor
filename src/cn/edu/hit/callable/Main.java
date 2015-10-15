package cn.edu.hit.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		FactorialCalculator fc = new FactorialCalculator(10);
		Future<Integer> result = tpe.submit(fc);
		int number = 0;
		try {
			number = result.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println(number);
		tpe.shutdown();
	}
}
