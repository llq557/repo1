package edu.wlxy.ch10;

import java.io.*;

public class FileOutputStreamdemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream  fout=new FileOutputStream("jk5191.txt",true);
		String  str=" ��ͬ����";
		byte[] temp=str.getBytes();
//		����1 
//		fout.write(temp);
//		����2
		for(int i=0;i<temp.length;i++){
			fout.write(temp[i]);
		}
		
		fout.close();
		System.out.println("�����������");

	}

}
