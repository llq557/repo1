package edu.wlxy.ch02;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class WhileDemo2 {
/*
 *  ��ȥ���ѼҾ۲͡��ڲ����ϣ��������㣺�ȿ�����������ȣ��Ͳ��ÿ��֣�����ȣ���һƿ���֡�


 */
	public static void main(String[] args) {
		// new Scanner(System.in)�൱�ڴ�����һ������
		Scanner sc=new Scanner(System.in); //sc�Ǽ��̵�����
		int count=0;//ͳ�ƺ��˶���ƿ����
		
//		System.out.println("�����ʣ���ȿ�����");
//		boolean  f=sc.nextBoolean();//��f �����  �ش��Ƿ�ȿ��֡�  true:��ʾ��  ��     false����ʾ����
//		while(f==true){
//			System.out.println("��һƿ���֡�");
//			count++;
//			System.out.println("�����ʣ��㻹����");
//			f=sc.nextBoolean();
//		}
		
		
		System.out.println("�����ʣ���ȿ�����");
		String  f=sc.next();//��f �����  �ش��Ƿ�ȿ��֡�  ��    �� ����
		while(f.equals("��")){
			System.out.println("��һƿ���֡�");
			count++;
			System.out.println("�����ʣ��㻹����");
			f=sc.next();
		}
		
		
		//����if  else  ��������Ľ�������ӷ������ǵ�˵��ϰ�ߡ�
		if(count==0){
			System.out.println("û�кȿ��֡�");
		}else{
			System.out.println("����"+count+"ƿ���֡�");
		}
		
	}

}
