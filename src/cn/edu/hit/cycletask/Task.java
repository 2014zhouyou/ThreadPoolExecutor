package cn.edu.hit.cycletask;

import java.util.Date;

public class Task implements Runnable{

	private String name;
	
    public Task(String name) {
    	this.name = name;
    }
    
    @Override
    public void run() {
    	System.out.println(name + " Hello : " + new Date());
    }
    
    
}
