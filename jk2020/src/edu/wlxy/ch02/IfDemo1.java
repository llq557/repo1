package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * ����źƵ�Java���Գɼ�����90�֣��źƾ��ܻ��һ��MP4��Ϊ����
 * 
 */
public class IfDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����źƵ�Java�ɼ�: "); //��ʾҪ����Java�ɼ�
        int score1 =  input.nextInt(); 	     //�ӿ���̨��ȡJava�ɼ�
        if ( score1 > 90 ) {    			 //�ж��Ƿ����90��
             System.out.println("��ʦ˵:��������һ��MP4��");
        }
     
	}

}
