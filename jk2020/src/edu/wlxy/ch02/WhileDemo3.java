package edu.wlxy.ch02;

import java.util.Scanner;

public class WhileDemo3 {
	/*
	 * ���ʹ��whileѭ��
	 * ��ʦÿ�����źƵ�ѧϰ�����Ƿ�ϸ�������ϸ���������С�
                ��ʦ���źư��ŵ�ÿ���ѧϰ����Ϊ�������Ķ��̲ģ�ѧϰ���۲��֣������ϻ���̣����մ��벿��

	 */
	public static void main(String[] args) {
		String answer;	//��ʶ�Ƿ�ϸ�
		Scanner input = new Scanner(System.in);
		System.out.print("�ϸ�����?(y/n)��");
		answer = input.next();
		
		while(!"y".equals(answer)){
			System.out.println("�����Ķ��̲ģ�");
			System.out.println("�����ϻ���̣�\n");
			System.out.print("�ϸ�����?(y/n)��");
			answer = input.next();
		}
		System.out.println("���ѧϰ����");
	}


}
