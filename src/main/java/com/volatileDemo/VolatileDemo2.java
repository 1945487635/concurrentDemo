package com.volatileDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VolatileDemo2 {
	public volatile int inc=0;
	Lock lock=new ReentrantLock();
	public void increase() {
		lock.lock();
		try {
			inc++;
		}finally {
			lock.unlock();
		}
		 
	} 
}
