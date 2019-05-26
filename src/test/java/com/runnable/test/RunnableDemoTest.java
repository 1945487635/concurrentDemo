package com.runnable.test;

import java.util.LinkedList;
import java.util.Queue;

import com.runnable.RunnableDemo;

public class RunnableDemoTest {
	private static Queue<Integer> tickets = new LinkedList<Integer>();
	public static void main(String[] args) {
		Runnable runnable=new RunnableDemo(tickets);
		for (int i =0; i <= 100; i++) {
			tickets.add(i);
		} 
		new Thread(runnable,"thread1").start();
		new Thread(runnable,"thread2").start();
	}
}
