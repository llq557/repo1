package edu.wlxy.ch04;

import java.util.Scanner;

/*
 * ������ʾ�˶������1���ļ��ж���������
 * 1�������ĳ�����ܣ��漰������ࣨ����3���ࣩ��
   ��Щ�ࣨ����3���ࣩ����д��ͬһ�������б���Ϊһ��java�ļ���Ҳ���Է�ɢд�ɶ���������ࣨ����3���ࣩ����Ϊ3���ļ���
2���������д��ͬһ�������ļ��У�Ҫ�����ĸ���Ϊ�����ļ������������ ���η��Ƿ���Ҫ��
       ͬһ���ļ��в�������ֶ��pubic���ε��ࡣ
   �ļ����� public ��� ��������һ�¡�
      �ļ������ĸ����а���main���ͱ������ĸ���Ϊ�ļ�����
       main�������ڵ������ ��������ǰ �� public ���Ρ�
3�����飺�ȷ�ɢд��һ����д��һ���ļ���
      ��ĳ������ʵ�֣�ֻ��Ҫ1���࣬����Խ�main����д�ڸ����С�

 */

 class Studentdemo{
String  name;
int age;
String classname;
String hobby;

public  void printInfo(){
System.out.println(name);	
System.out.println("���䣺"+age);	
System.out.println("�༶��"+classname);	
System.out.println("���ã�"+hobby);	
}


}

public class Teacherdemo{
	String tchname;
	int  tchage;
	
	public void printTchInfo(){
		System.out.println(tchname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Studentdemo st1=new Studentdemo();
  st1.printInfo();//st1��û�и�ֵ������ʹ��Ĭ��ֵ
  
  
  Studentdemo st2=new Studentdemo();
  st2.name="�ŷ�1";
  st2.age=19;
  st2.classname="�����2��";
  st2.hobby="�Լ�";
  st2.printInfo();
  
  Teacherdemo  t1=new Teacherdemo();
  t1.tchname="����1";
  t1.printTchInfo();
  
  int i=0;
	Studentdemo [] sst=new Studentdemo[3];
	
	Scanner  sc=new Scanner(System.in);
	for(i=0;i<3;i++){
		sst[i]=new Studentdemo();
		System.out.println("������������");
		sst[i].name=sc.next();
	}
	
      sst[1].printInfo();
	}
	
}

