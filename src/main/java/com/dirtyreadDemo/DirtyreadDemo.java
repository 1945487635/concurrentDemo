package com.dirtyreadDemo;

public class DirtyreadDemo {
	private String username="oldUsername";
	private String password="oldPassword";
	public synchronized void updateUser(String username,String password) {
		this.username=username;
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  this.password=password;
	  System.out.println("update: username: "+username+",password:"+password);
	}
	public void queryUser() {
		System.out.println("query: username: "+username+",password:"+password);
	}
}
