package edu.wlxy.ch05;
/**
 * �����ࡣ
 */
public class Test {
	/**
	 * �ֱ𴴽�Bird��Fish��Ķ��� �ڿ���̨����������Ϣ��
	 */
	public static void main(String[] args) {
		Bird bird = new Bird(4, "��ɫ");
		Fish fish = new Fish(2, 5);
		bird.info();
		bird.eat();
		fish.info();
		fish.eat();
//		�����಻��ʵ��������
//		Animal  an=new Animal();
	}
}
