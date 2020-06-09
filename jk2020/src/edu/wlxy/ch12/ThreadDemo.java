package edu.wlxy.ch12;

class Thread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"Ϊ�� "+i+"λѧ�����ͷ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"Ϊ��"+i+"λѧ���ṩ�׷�����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}


public class ThreadDemo {
	public static void main(String[] args) {
		Runnable  t1=new Thread1() ;
		Runnable  t2=new Thread2() ;
		Runnable  t3=new Thread2() ;
		Runnable  t4=new Thread2() ;
		new Thread(t1,"����1").start();
		new Thread(t2,"����2").start();
		new Thread(t3,"����3").start();
		new Thread(t4,"����4").start();
	}

}
