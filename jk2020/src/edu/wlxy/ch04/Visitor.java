package edu.wlxy.ch04;

import java.util.Scanner;

public class Visitor {
	String name;	//����
	int age;		//����
	//��ʾ��Ϣ����
	public void show(){
			if(age>=18 && age<=60){		//�ж�����
				System.out.println(name+"����Ϊ"+age+",�۸�Ϊ20Ԫ" );
			}else{
				System.out.println(name + "������Ϊ��"+age+"�����");
			}
}
}
	