package edu.wlxy.ch10;

import java.io.*;

public class FileCopydemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("source\\�廷֮��.mp3"); //  ת���ַ�"\\"
		FileOutputStream fout=new FileOutputStream("��.mp3");
		int temp=0;
		long begintime = System.currentTimeMillis();
		while((temp=fin.read())!=-1){
			fout.write(temp);
		}
		long endtime = System.currentTimeMillis();
		System.out.println("�����ļ������ĵ�ʱ���ǣ�" + (endtime - begintime) + "����");
		fout.close();
		fin.close();
		System.out.println("ok");
		
	}

}
