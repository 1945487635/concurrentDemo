package com.dirtyreadDemo.test;

import org.junit.Test;

import com.dirtyreadDemo.DirtyreadDemo;
import com.dirtyreadDemo.DirtyreadDemo2;

public class DirtyreadDemoTest {
	@Test
	public  void dirtyreadDemoTest() {
		 String username="newUsername";
		 String password="newPassword";
		final DirtyreadDemo dirtyreadDemo= new DirtyreadDemo();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dirtyreadDemo.updateUser(username, password);
			}
		}).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dirtyreadDemo.queryUser();
	}
	@Test
	public  void dirtyreadDemo2Test() {
		 String username="newUsername";
		 String password="newPassword";
		final DirtyreadDemo2 dirtyreadDemo= new DirtyreadDemo2();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dirtyreadDemo.updateUser(username, password);
			}
		}).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dirtyreadDemo.queryUser();
	}

}
