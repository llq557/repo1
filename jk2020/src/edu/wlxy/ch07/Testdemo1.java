package edu.wlxy.ch07;

import java.util.InputMismatchException;
import java.util.*;


public class Testdemo1 {

	public static void main(String[] args) {
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = in.nextInt();
		System.out.print("���������:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d / %d = %d", 
						num1, num2, num1/ num2));
		int[]  a={1,2,3,4,5};
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		
		
		System.out.println("��лʹ�ñ�����");
		}catch(ArithmeticException e){
			System.out.println("����������0");
//			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("�������ͳ�������������");
//			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�����±�Խ��");
//			e.printStackTrace();
		}catch(Exception e){
			System.out.println("�����쳣���");
//			e.printStackTrace();
		}finally{
			System.out.println("�������Ѿ����н�����");
		}
	}

}
