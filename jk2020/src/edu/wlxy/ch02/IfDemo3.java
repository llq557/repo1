package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * ����ź�Java���Գɼ�����98�֣���ʦ�ͽ�����һ��MP4��
 * ������ʦ�ͷ������б���
 */
public class IfDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>98){
			System.out.println("����һ��MP4");
		}else{
			System.out.println("����ѧϰ");
		}
		
	}

}
