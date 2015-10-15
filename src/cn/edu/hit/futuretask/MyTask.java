package cn.edu.hit.futuretask;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyTask extends FutureTask<String> {

	private String name;
	
    public MyTask(Callable<String> c) {
    	super(c);
    	this.name = ((Task) c).getName();
    }
    
    @Override
    protected void done() {
    	System.out.println("Thread is done " + name);
    }
}
