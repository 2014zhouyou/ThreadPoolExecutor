package cn.edu.hit.completionservice;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 演示如何使用CompletionService 将任务的执行和结果处理分离
 * @author zhou.you
 */
public class Main {

	public static void main(String[] args) {
		ExecutorService es = (ExecutorService) Executors.newCachedThreadPool();
		CompletionService<String> service = new ExecutorCompletionService<>(es);
		
		//启动线程，等待task的返回结果，然后进行相应的处理
		TaskResultProcess trp = new TaskResultProcess(service);
		es.execute(trp);
		
		//启动线程，执行task
		Task t = new Task("zhouyou");
		service.submit(t);
		
		//关闭executor
		es.shutdown();
	}
}
