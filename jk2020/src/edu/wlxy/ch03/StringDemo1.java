package edu.wlxy.ch03;


import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	String uname,pwd;
    	System.out.print("�������û����� ");
    	uname=input.next();
    	System.out.println(uname.toLowerCase());
    	System.out.print("���������룺 ");
    	pwd=input.next();
    	if( uname.equalsIgnoreCase("Tom") ){
        	System.out.print("�ɹ��� ");
   	 }else{
        	System.out.print("ʧ��");
    	}		


	}

}
