package com.runnable;

import java.util.Queue;

/*
 * implement Runnable interface
 * override run method
 */
public class RunnableDemo implements Runnable {
	private Queue<Integer> tickets=null;
	public RunnableDemo(Queue<Integer> tickets) {
		this.tickets=tickets;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer ticket=null;
		while ((ticket=tickets.poll())!=null) {
			System.out.println(Thread.currentThread().getName()+":"+ticket);
			
		}
	}

}
