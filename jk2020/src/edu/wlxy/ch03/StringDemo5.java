package edu.wlxy.ch03;


public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="abc.javab.java";
int a=str1.lastIndexOf('.');
System.out.println(a);
String str2=str1.substring(a);
if(str2.equals(".java")){
	System.out.println("���");
}else{
	System.out.println("�����");
}
	}

}
