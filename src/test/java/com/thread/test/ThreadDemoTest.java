package com.thread.test;

import java.util.LinkedList;
import java.util.Queue;

import com.thread.ThreadDemo;

public class ThreadDemoTest {
	private static Queue<Integer> tickets = new LinkedList<Integer>();
	public static void main(String[] args) {
		for (int i =0; i <= 100; i++) {
			tickets.add(i);
		} 
		new ThreadDemo("thread1",tickets).start();
		new ThreadDemo("thread2",tickets).start();
	}
}
