package edu.wlxy.ch04;

import java.util.concurrent.SynchronousQueue;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person p1=new Person();
     p1.setName("tom");
     p1.setAge(59);
     p1.showInfo();
   System.out.println("---"+p1.getName());
     
     Person p2=new Person("̷��");
     
     p2.setAge(-19);
     p2.showInfo();
     p2.eat();
     Person p3=new Person(-19);
    
     p3.showInfo();
     
   Person p4=new Person("����",258);
  
   p4.showInfo();
   
   
   System.out.println("=============");
   Student st1=new Student();
 
   st1.setName("������");
   st1.exam();
   st1.eat();

    Student st2=new Student("tom");
       st2.eat();
     Student st3=new Student("¹��",19,201940001);
       st3.eat(1800);
       st3.showInfo();
    
       System.out.println(st3.abc);
//     ��̬�ĵı�����ʽ1���������ء�������д��
//       ��ʵ�ʱ�̵�ʱ�򣬼��������ݱ������͵Ĳ�ͬ�������Ĳ�ͬ���Զ���ִ�����Ӧ�ķ�����
       p2.eat();//p2��Person����
       st2.eat();//st2��Student����
       st3.eat(1800);//st3��Student����,������ͬ
//       ��̬�ĵı�����ʽ2�����������ʵ����������� is-a��ϵ
     Person pst1=new Student("�ŷ�",28,201940022);  
       pst1.eat();
      
//       Student stp1=new Person();//������󣬲�����is-a  ��ϵ
       
	}

}
