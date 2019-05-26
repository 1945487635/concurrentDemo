package com.volatileDemo;
/*
 * volatile does not guarantee atomicity
 */
public class VolatileDemo {
	public volatile int inc=0;
	public void increase() {
		inc++;
	} 
}
