package edu.wlxy.ch10;

import java.io.File;

public class FileAttributeTest {

	public static void main(String[] args) {
		File file=new File("2020.jpeg");
		System.out.println("�ļ���Ŀ¼�Ƿ���ڣ�"+file.exists());
		System.out.println("���ļ���"+file.isFile());
		System.out.println("��Ŀ¼��"+file.isDirectory());
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ�·����"+file.getPath());
		System.out.println("�ļ�����·����"+file.getAbsolutePath());
		System.out.println("�ļ���С(�ֽ�)��"+file.length());
	}

}
