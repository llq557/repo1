package edu.wlxy.ch02;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[]={10,56,13,78,6,90};
		int[] b=new int[6];//java��û�и���ֵ����Ӧint�ͱ��� Ĭ��ֵ��0
		String[] name=new String[]{"�й�","����","�人"};
		
		System.out.println(a[0]);
		System.out.println(b[1]);
		System.out.println(name[2]);
		//����1
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("----------");
		//Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		System.out.println("--����---");
//		System.arraycopy(a, 1, b, 2, 3);
//		for(int i=0;i<b.length;i++){
//			System.out.println(b[i]);
//		}
		
		System.out.println(b);
	}

}
