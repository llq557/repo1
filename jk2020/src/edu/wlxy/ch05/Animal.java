package edu.wlxy.ch05;
/**
 * �����࣬
 * ��ʾ�����ࡣ
 * һ���ó��󷽷��淶�������Ϊ��
 */
public abstract class Animal {
	private int age = 0;//����
	/**
	 *  ���ڻ�ȡ��Ϣ�ĳ��󷽷��� 
	 */
	public  void info(){
		//��������û�д��룬
	}
	public  abstract void eat();
	
	
public Animal() {
		
	}
	
	public Animal(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
