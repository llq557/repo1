package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * �齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա
 * ʵ��˼·
 *    1.���������
 *    2.�ӿ���̨����һ��4λ��Ա��
 *    3.�ֽ��ð�λ��
 *    4.�ж��Ƿ������˻�Ա
 *    ��ʾ�������������0~9���ķ���
 *     int random=(int)(Math.random()*10);
 */
public class IfExec2 {

	public static void main(String[] args) {
		/* ���������
		 * Math.random()����һ�� ���ڵ���0 ��С��1 ��  С����
		 *  
		 *   */
		int  r=(int)(Math.random()*10); //��ΪҪ�Ͱ�λ�ϵ����ֱȽϴ�С������Ҫǿ������ת����
		System.out.println("�������������"+r);
		
		
		/* �ӿ���̨����һ��4λ��Ա�� */
		System.out.println("-------------���˳齱------------");
		System.out.print("������4λ��Ա�ţ� ");
		Scanner sc=new Scanner(System.in);
		int custNo=sc.nextInt();

		/* �ֽ��ð�λ */
		int baiwei = 0;
		baiwei=custNo/100%10;
		
		/* �ж��Ƿ������˻�Ա */
		//   ���ע�� ����ȡ��ע�͵Ŀ�ݼ��� ctrl+/ 
		if (baiwei==r) {
			System.out.println(custNo + "�����˿ͻ��������ֻ�һ����");
		} else {
			System.out.println(custNo + "  лл����֧�֣�");
		}


	}

}
