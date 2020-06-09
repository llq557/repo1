package edu.wlxy.ch12;

public class SimpleThread extends Thread {
	public SimpleThread(String name) {						// ����Ϊ�߳�����
		setName(name);
	}
	public void run() {									// ����run()����
		int i = 0;
		while (i++ < 5) { 								// ѭ��5��
			try {
				System.out.println(getName() + "ִ�в���" + i);
				Thread.sleep(1000); 						// ����1��
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		SimpleThread thread1 = new SimpleThread("����1"); 	// �����߳�1
		SimpleThread thread2 = new SimpleThread("����2"); 	// �����߳�2
		thread1.start(); 									// �����߳�1
		thread2.start(); 									// �����߳�2
	}
}

