package edu.wlxy.ch12;

public class Example05 {
	public static void main(String[] args) {
		TicketWindow2 task = new TicketWindow2();//�����̵߳����������
		new Thread(task, "����ѧԺ��Ʊ��").start();//�����̲߳�����Ϊ����1�� �����߳�
		new Thread(task, "������ѧ��Ʊ��").start();//�����̲߳�����Ϊ����2�� �����߳�
		new Thread(task, "���ݹų���Ʊ��").start();//�����̲߳�����Ϊ����3�� �����߳�
			}
}
//�̵߳�������
class TicketWindow2 implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
		while(true){
			if (tickets > 0) {
			Thread th = Thread.currentThread();//��ȡ��ǰ����run�������߳�
			String th_name = th.getName();//�õ��̵߳�����
			System.out.println(th_name + "���ڷ��۵�" + tickets-- + "��Ʊ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
}

