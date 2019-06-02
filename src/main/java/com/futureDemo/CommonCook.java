package com.futureDemo;


public class CommonCook {
	public static void main(String[] args) throws InterruptedException {
		long startTime=System.currentTimeMillis();
		OnlineShopping thread=new OnlineShopping();
		thread.start();
		thread.join();
		Thread.sleep(2000);
		Shicai shicai=new Shicai();
		System.out.println("�ڶ�����ʳ�ĵ�λ");
		System.out.println("����������ʼչ�ֳ���");
		cook(thread.chuju, shicai);
		System.out.println("�ܹ���ʱ"+(System.currentTimeMillis()-startTime)+"ms");
	}
	static class OnlineShopping extends Thread{
		private Chuju chuju;
		@Override
		public void run() {
			System.out.println("��һ��:�µ�");
			System.out.println("�ڶ������ȴ��ʹ�");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��һ��������͵�");
			chuju =new Chuju();
			
		}
	}
	static void cook(Chuju chuju,Shicai shicai) {}
	static class Chuju {}
	static class Shicai {}	
}
