package edu.wlxy.ch05;
/**
 * �����Ρ�
 */
class Square extends Shape {
	private double height = 0; // �����εı߳�
	
	public Square(double height) {
		this.height = height;
	}
	public double getArea() {
		return (this.height * this.height);
	}
	public double getPerimeter() {		
		return 4*height;
	}
}