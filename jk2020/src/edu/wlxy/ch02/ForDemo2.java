package edu.wlxy.ch02;

import java.util.Scanner;

public class ForDemo2 {
	/*
	 * ѭ������ĳͬѧ��1ѧ�ڿ��Ե�5�ſγɼ���������ƽ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		String  name=sc.next();
	    int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("�������"+i+"�ſγ̳ɼ�");
			int  score=sc.nextInt();
			
			sum=sum+score;
			
		}
		
		//System.out.println(name+"��ƽ������"+sum/5.0);
		
		
	}

}
