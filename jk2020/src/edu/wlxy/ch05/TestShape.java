package edu.wlxy.ch05;
/**
 * �����ࡣ
 */
class TestShape {
	public static void main(String[] args) {
		//1����ȡ�����ε�������ܳ�
		Shape square = new Square(3);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		//2����ȡԲ��������ܳ�
		Circle circle = new Circle(3);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
	}
}
