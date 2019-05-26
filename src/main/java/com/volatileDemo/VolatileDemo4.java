package com.volatileDemo;

public class VolatileDemo4 {
	volatile boolean flag=false;
	public void method01() {
		while (!flag) {
			doSomething();
		} 
	}
	volatile boolean inited=false;
	public void method02() {
		 init();
		 inited=true;
		 while (!inited) {
			sleep(); 
		}
	}
	public void init() {
		
	}
	public void sleep() {
		
	}
	public void doSomething() {
		
	}
}
//Double check
class Singleton{
	private volatile static Singleton instance=null;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if (instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}	
}
