package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * �źƵ�Java�ɼ�����98�֣��������ֳɼ�����80�֣���ʦ�ά������
 * ����Java�ɼ�����100�֣��������ֳɼ�����70�֣���ʦҲ�ά����
 */
public class IfDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����źƵ�Java�ɼ�: "); //��ʾҪ����Java�ɼ�
        int score1 =  input.nextInt(); 	     //�ӿ���̨��ȡJava�ɼ�
        System.out.print("�����źƵ����ֳɼ�: "); 
        int score2 =  input.nextInt(); 	     
        if ( (score1 > 98 && score2>80)  ||   (score1 == 100 && score2>70)) {    			 //�ж��Ƿ����90��
             System.out.println("��ʦ˵:��������һ��MP4��");
        }
		
	}

}
