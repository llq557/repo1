package edu.wlxy.ch01;

import java.util.Scanner;
//��c�����е�include���ƣ�Ҫ������ļ�
public class DemoExec01 {

	public static void main(String[] args) {
		//ʵ����(����)һ��Scanner�����൱�ڴ���1������
		Scanner sc=new Scanner(System.in);
		System.out.println("������ԭʼ���ݣ�");
		int date=sc.nextInt();//���÷�����������������һ��int������
		int result=0;
		result=(date*10+5)/2+(int)3.1415;
		System.out.println(date+"�������ܺ󣬱����"+result);
	}

}
