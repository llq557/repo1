package edu.wlxy.ch10;

import java.io.*;

public class FileWriterdemo {

	public static void main(String[] args) throws Exception {
		FileWriter  fout=new FileWriter("jk5191.txt", true);
		String  str="����Լ�";
		
//		����1 
		fout.write(str);
//		����2  ���ʺ�����
//		for(int i=0;i<temp.length;i++){
//			fout.write(temp[i]);
//		}
		
		fout.close();
		System.out.println("�����������");

	}

}
