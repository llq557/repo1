package edu.wlxy.ch02;

import java.util.*;
public class RunningMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������ɼ���s����");
	double score = sc.nextDouble();
		System.out.print("�������Ա�");
		String gender = sc.next();
		if(score<=10){
//			System.out.println("�������");
			if(gender.equals("��")){  // �ַ����Ƚ��Ƿ���ȣ�ʹ��equals()  ,����ʹ��==
				System.out.println("���������������");
			}else {
				System.out.println("����Ů���������");
			}
			
		}else{
			System.out.println("��̭��");
		}
		
		
		
		
		
	}
}
