package edu.wlxy.ch02;

public class WhileDemo1 {
/*
 * ���5�顰�ú�ѧϰ���������ϣ���

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i < 1){
			System.out.println("��" +i+ "��д���ú�ѧϰ");
			i=i+1;
		}
		
		System.out.println("--------------");
		
		int j=1;
		do{
			System.out.println("��" +j+ "��д����������");
			j=j+1;
		}while(j < 1);
	}
	
}
