package edu.wlxy.ch04;

import java.util.Scanner;

public class VisitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();		
		System.out.print("������������");
		v.name = input.next();			
		System.out.print("���������䣺");
		v.age = input.nextInt();		
		v.show();                       
	}

}
