package cn.edu.hit.rejecttask;

public class Task implements Runnable {

	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		System.out.println( name + " : Task running....");
	}
}
