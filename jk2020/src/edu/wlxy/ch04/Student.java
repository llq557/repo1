package edu.wlxy.ch04;

public class Student extends Person {
int sno;
int syear;
int abc=2000;
public void exam(){
	System.out.println("���翼��");
}
public void eat(){
	System.out.println(getName()+"��ʳ�á�");
}
public void eat(int money ){
	System.out.println(getName()+"��ʳ�á������"+money);
}

public void showInfo(){//��д����ķ����������� �����ͬ���������ܣ����ܾͱ仯�ˡ�
	super.showInfo();//���ø���ķ���
	System.out.println("�ҵ�ѧ����"+sno);
}

public Student(String name){
// ����1  �Լ���д
//	setName(name);//���ü̳й����ķ������ó�ʼֵ
	
//	����2  ����Ĺ��췽�����ܼ̳У����ǿ��Ե��õġ�
//	���ùؼ���  super  ����ʾ����
    super(name);//�൱�� Person(name);
}

public Student(String name,int age,int sno ) {
//	super ���ø��๹�췽��ʱ�������ڷ����ĵ�1�С�
	super(name,age);//�൱�� Person(name,age); 
	this.sno=sno;//this��ʾ����
}

public Student() {
	
}


}
