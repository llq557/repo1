package edu.wlxy.ch10;

import java.io.*;

public class FileInoutdemo1 {

	public static void main(String[] args) throws Exception {
//		1
		File  file=new File("reader.txt");
//2
		FileInputStream fin=new FileInputStream(file);
//		3
		int temp=0;
	/*	
		while(true){
			temp=fin.read();
			if(temp==-1)  break;
			System.out.print((char)temp);
		}
	*/	
//		����д����һ��Ҫ���ա��������ȡ�ļ����ǲ������д��
		while((temp=fin.read())!=-1){
			System.out.print((char)temp);
		}
		
		
//		4
		fin.close();
		
	}

}
