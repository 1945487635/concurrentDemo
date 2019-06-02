package com.threadLocal;

public class MyTest {
	ThreadLocalVar<Long> longLocal=new ThreadLocalVar<Long>();
	ThreadLocalVar<String> stringLocal=new ThreadLocalVar<String>();
	public void set() {
		longLocal.set(Thread.currentThread().getId());
		stringLocal.set(Thread.currentThread().getName());
	}
	public long getLong() {
		return longLocal.get();
	}
	public String getString() {
		return stringLocal.get();
	}
	public static void main(String[] args) throws InterruptedException {
		final MyTest test=new MyTest();
		test.set();
		System.out.println(test.getLong());
		System.out.println(test.getString());
		for(int i=0;i<3;i++) {
			Thread thread=new Thread() {
				public void run() {
					test.set();
					System.out.println(test.getLong());
					System.out.println(test.getString());
				};
			};
			thread.start();
			thread.join();
		}
		System.out.println(test.getLong());
		System.out.println(test.getString());
	}
 }
