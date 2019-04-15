package com.wzh.demo.concurrentProgrammingArt.lock;

/**
 * @desc: volatile修饰符测试
 * @author: wzh
 * @date: 2019年4月14日
 */
public class VolatileTest implements Runnable{
	private volatile boolean running = true;
	  
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	@Override
	public void run() {
		while(running){
		}
		System.out.println("子线程"+Thread.currentThread().getName()+"停止");
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		  VolatileTest task = new VolatileTest();
	    //启动子线程
	    new Thread(task).start();
	    Thread.currentThread().sleep(1000);
	    task.setRunning(false);
	    System.out.println("主线程停止");
	  }

	
}