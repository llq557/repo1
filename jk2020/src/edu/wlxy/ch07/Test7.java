package edu.wlxy.ch07;

import java.util.Scanner;

public class Test7 {
	/**
	 * ͨ��try-catch���񲢴����쳣��
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
			divide();
		
//		try {
//			divide();
//		} catch (Exception e) {
//			System.err.println("���ִ��󣺱������ͳ���������������" 
//					+ "��������Ϊ��");
//			e.printStackTrace();
//		}
	}
//	/**
//	 * ͨ��throws���������쳣��
//	 */
//	public static void main(String[] args) throws Exception {
//		divide();
//	}

	/**
	 * ���뱻�����ͳ����������̲������
	 * @throws Exception
	 */
	public static void divide()  throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = in.nextInt();
		System.out.print("���������:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d / %d = %d", 
				num1, num2, num1/ num2));
	}
}
