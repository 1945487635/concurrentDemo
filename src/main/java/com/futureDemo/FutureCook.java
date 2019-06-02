package com.futureDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureCook {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime =System.currentTimeMillis();
		Callable<Chuju> onlineShopping=new Callable<Chuju>() {

			@Override
			public Chuju call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("��һ�����µ�");
				System.out.println("��һ�����ȴ��ͻ�");
				Thread.sleep(5000);
				System.out.println("��һ��:����͵�");
				
				return new Chuju();
			}
			
		};
		FutureTask<Chuju> task=new FutureTask<>(onlineShopping);
		new Thread(task).start();
		//�ڶ��� : ȥ���й���ʳ��
		Thread.sleep(2000);
		Shicai shicai=new Shicai();
		System.out.println("��������ʳ�ĵ�λ");
		//�������� �ó������ʳ��
		if (!task.isDone()) { //��ϵ���Ա��ѯ���Ƿ񵽻�
			System.out.println("�����������߻�û��������þ͵��ţ����鲻�þ�����cancel����ȡ��������");
		}
		Chuju chuju=task.get();
		System.out.println("������:���ߵ�λ����ʼչ�ֳ���");
		cook(chuju, shicai);
		System.out.println("�ܹ���ʱ��"+(System.currentTimeMillis()-startTime)+"ms");
	}
	static void cook(Chuju chuju,Shicai shicai) {}
	static class Chuju {}
	static class Shicai {}
}
