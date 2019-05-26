package com.volatileDemoTest;

import org.junit.Test;

import com.volatileDemo.VolatileDemo;
import com.volatileDemo.VolatileDemo1;
import com.volatileDemo.VolatileDemo2;
import com.volatileDemo.VolatileDemo3;

public class VolatileDemoTest {
	@Test
	public void volatileDemo() {
		final VolatileDemo volatileDemo=new VolatileDemo();
		//final VolatileDemo1 volatileDemo=new VolatileDemo1();
		//final VolatileDemo2 volatileDemo=new VolatileDemo2();
		//final VolatileDemo3 volatileDemo=new VolatileDemo3();
		for(int i=0;i<10;i++) {
			new Thread() {
				public void run() {
					for(int j=0;j<1000;j++) {
						volatileDemo.increase();
					}
				};
			}.start();
		}
		while (Thread.activeCount()>1) {
			Thread.yield();
			System.out.println(volatileDemo.inc);
		}
	}
}
