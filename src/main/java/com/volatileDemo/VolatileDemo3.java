package com.volatileDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo3 {
	public AtomicInteger inc=new AtomicInteger();
	public void increase() {
		inc.getAndIncrement();
	} 
}
