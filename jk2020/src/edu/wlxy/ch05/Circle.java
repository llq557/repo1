package edu.wlxy.ch05;
class Circle extends Shape {
	private double radius = 0; // Բ�İ뾶
	private final static double PI = 3.14; // Բ����
	/**
	 * �вι��췽����
	 *  radius �뾶
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (PI * radius * radius);
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}
}
