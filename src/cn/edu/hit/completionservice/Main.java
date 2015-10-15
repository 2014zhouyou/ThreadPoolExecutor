package cn.edu.hit.completionservice;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��ʾ���ʹ��CompletionService �������ִ�кͽ���������
 * @author zhou.you
 */
public class Main {

	public static void main(String[] args) {
		ExecutorService es = (ExecutorService) Executors.newCachedThreadPool();
		CompletionService<String> service = new ExecutorCompletionService<>(es);
		
		//�����̣߳��ȴ�task�ķ��ؽ����Ȼ�������Ӧ�Ĵ���
		TaskResultProcess trp = new TaskResultProcess(service);
		es.execute(trp);
		
		//�����̣߳�ִ��task
		Task t = new Task("zhouyou");
		service.submit(t);
		
		//�ر�executor
		es.shutdown();
	}
}
