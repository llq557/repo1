package edu.wlxy.ch05;
/**
 * ���࣬�̳��Զ����ࡣ
 */
public  class Bird extends Animal {
	private String color = "��ɫ";//��ɫ
	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void info() {
		System.out.println("����һֻ" + color + "����");
		System.out.println("����" + this.getAge() + "���ˣ�");
		System.out.println();
	}
	public void eat(){
		System.out.println("���������г��");
	}
	
	
	
	
	
}
