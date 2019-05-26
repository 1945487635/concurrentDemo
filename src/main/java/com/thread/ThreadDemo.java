package com.thread;

import java.util.Queue;
/**
 * 
 *1. extend Thead class
 *2. override run method
 */
public class ThreadDemo extends Thread{
	private String threadName="";
	private Queue<Integer> tickets=null;
	public ThreadDemo(String threadName,Queue<Integer> tickets) {
		this.tickets=tickets;
		this.threadName=threadName;
	}
	 
	@Override
	public void run() {
		Integer ticket=null;
		while ((ticket=tickets.poll())!=null) {
			System.out.println(threadName+":"+ticket);			
		}
	}
}
