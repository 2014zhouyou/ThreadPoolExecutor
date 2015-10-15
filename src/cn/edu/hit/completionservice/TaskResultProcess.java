package cn.edu.hit.completionservice;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class TaskResultProcess implements Runnable {
	
	private CompletionService<String> service;
	
	public TaskResultProcess(CompletionService<String> service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
	@Override
	public void run() {
	    try {
	    	Future<String> result = service.take();
			String message = result.get();
			System.out.println(message);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
