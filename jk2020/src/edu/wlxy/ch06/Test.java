package edu.wlxy.ch06;


/**
 * �����ࡣ
 * ��ʾʵ�ֶ���ӿ�
 */
public class Test {
	public static void main(String[] args) {
		
		//1�������������ʦ����
		SoftEngineer xiaoMing = new SoftEngineer("С��");
		System.out.println("����һ���������ʦ���ҵ����ֽ�"
				+xiaoMing.getName()+"��");
		
		//2���������ʦ���д����д	
		xiaoMing.writeProgram();
		
		//3���������ʦ����ҵ�񽲽�	
		xiaoMing.giveBizSpeech();

		
	}
}
