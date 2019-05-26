package com.volatileDemo;

public class VolatileDemo1 {
	public int inc=0;
	public synchronized void increase() {
		inc++;
	}
}
