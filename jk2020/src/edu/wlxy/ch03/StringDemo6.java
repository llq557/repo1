package edu.wlxy.ch03;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String  str1="a123.ja";
  String str2="��á�";
  int  x=str1.lastIndexOf('.');
  System.out.println(str1.charAt(5));
 String  str3=str1.substring(x);//��ָ��λ�ÿ�ʼ��ȡ�ַ�����ĩβ����
  System.out.println(str1.substring(3,4));//��ָ��λ�ÿ�ʼ��ȡ�ַ�����ָ��λ��ǰһ������
	if(str3.equals(".java")){
		System.out.println("yy");
	}else{
		System.out.println("nn");
	}
	
	}

}
