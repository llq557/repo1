package edu.wlxy.ch03;


import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
        // ��������
        boolean fileCorrect = false; 	//��ʶ�ļ����Ƿ���ȷ
        boolean emailCorrect = false; 	//��ʶE-mail�Ƿ���ȷ
        System.out.print("---��ӭ������ҵ�ύϵͳ---");
        Scanner input = new Scanner(System.in);
        System.out.println("������Java�ļ���: ");
        String fileName = input.next();
        System.out.print("�������������:");
        String email = input.next();
        
        //���Java�ļ���
        int index = fileName.lastIndexOf(".");  //"."��λ��
        if(index!=-1 && index!=0 && 
            fileName.substring(index).equals(".java")){
 
            fileCorrect = true;   	//��ʶ�ļ�����ȷ
        }else{
            System.out.println("�ļ�����Ч��");
        }        
        //�����������ʽ
        if(email.indexOf('@')!=-1 &&
            email.indexOf('.')>email.indexOf('@')){  
            emailCorrect = true;   	//��ʶE-mail��ȷ
        }else{
            System.out.println("E-mail��Ч��");
        }        
        //��������
        if(fileCorrect && emailCorrect){
            System.out.println("��ҵ�ύ�ɹ�!");
        }else{
            System.out.println("��ҵ�ύʧ��!");
        }

	}

}
