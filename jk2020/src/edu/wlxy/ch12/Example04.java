package edu.wlxy.ch12;

public class Example04 {
	public static void main(String[] args) {
		new TicketWindow1("����ѧԺ��Ʊ��").start(); // ������һ���̶߳���TicketWindow������
		new TicketWindow1("������ѧ��Ʊ��").start(); // �����ڶ����̶߳���TicketWindow������
		new TicketWindow1("���ݹų���Ʊ��").start(); // �����������̶߳���TicketWindow������
			}
}
class TicketWindow1 extends Thread {
	
	
	public TicketWindow1(String name){
		setName(name);
	}
	private int tickets = 100;
	public void run() {
		while (true) { // ͨ����ѭ������ӡ���
		  if (tickets > 0) {
			Thread th = Thread.currentThread(); // ��ȡ��ǰ�߳�
			String th_name = th.getName(); // ��ȡ��ǰ�̵߳�����
		   System.out.println(th_name + " ���ڷ��۵� " + tickets-- + " ��Ʊ ");
			}
		}
	}
}
