package edu.wlxy.ch05;
/**
 * ���࣬�̳��Զ����ࡣ
 *
 */
public  class Fish extends Animal {
	private int weight = 4;//����
	public Fish(int age, int weight) {
		super(age);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void info() {
		System.out.println("����һֻ" + weight + "���ص��㣡");
		System.out.println("����" + this.getAge() + "���ˣ�");
		System.out.println();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�����С�㣬С������");
	}
}
