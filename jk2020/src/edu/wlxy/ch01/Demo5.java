package edu.wlxy.ch01;

import java.util.Scanner;
//��c�����е�include���ƣ�����һЩ�⺯����
/*
 * ��ʾ ͨ����������������͵�����
 * 
 */



public class Demo5 {

	public static void main(String[] args) {
		// ʵ����һ�����󣨴���һ�����̶���
		Scanner  sc=new Scanner(System.in);
		System.out.println("������ԭʼ���ݣ�");
     int data=sc.nextInt();
     int result=0;
     result=(int)((data*10+5)/2+3.14159);
     System.out.println(data+"�������ܺ���"+result);
     System.out.println("==================");
     System.out.println("������f1��");
     float  f1=sc.nextFloat();//���÷�����������������һ��float������
     System.out.println("������d1��");
     double  d1=sc.nextDouble();
     
     System.out.println("f1="+f1);
     System.out.println("d1="+d1);
     
     System.out.println("�������ַ�����");
     String  str=sc.next();
     System.out.println("str="+str);
     
     char ch1=str.charAt(0);//���ַ����л�ȡָ��λ�õ��ַ�
     System.out.println("ch1="+ch1);
     
     char ch2=str.charAt(5);//���ַ����л�ȡָ��λ�õ��ַ�
     System.out.println("ch2="+ch2);
	}

}
