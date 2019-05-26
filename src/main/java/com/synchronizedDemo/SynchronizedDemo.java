package com.synchronizedDemo;

public class SynchronizedDemo {
	synchronized public void methodA() {
	}

	synchronized static void methodB() {
	}

	public void methodC() {
		synchronized (this) {
		}
	}

	public void methodD() {
		synchronized (SynchronizedDemo.class) {

		}
	}
}
