package edu.wlxy.ch04;
/*
 * ��ʾ���췽������������
 * 
 */
public class Person {
private  String  name;//��Ա����
private int  age;
private String  sex;
     int abc=1000; 
   
public   void eat(){
	System.out.println(name+"��С��Ϻ��");
}
public void showInfo(){
	System.out.println(name+"������"+age+"���ˡ�");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public int getAge() {
	return age;
}

public void setAge(int age){
//  ��age<0 �� age>150  ��ʹ��Ĭ��ֵ 18.
	if(age<0 || age>150){
   	 this.age=18;
    }else{
    	this.age=age;	
    }
}


//����1�����췽����Ϊ2����Ա��������ֵ
public Person(){
}
//����1�����췽����Ϊ1����Ա��������ֵ
public Person(String name){//�ֲ�����
	this.name=name; // this �������ֳ�Ա�����;ֲ������� �ؼ���
}
public Person(int  age){
	this.setAge(age);
}

public Person(String name, int age) {
	this.name = name;
	this.setAge(age);
}

public Person(String name, int age, String sex) {
	this.name = name;
	this.setAge(age);
	this.sex = sex;
}


}
