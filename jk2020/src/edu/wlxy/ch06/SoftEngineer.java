package edu.wlxy.ch06;



/**
 * �������ʦ��
 *  ��ʾʵ�ֶ���ӿ�
 */
public class SoftEngineer implements Programmer, BizAgent {

	private String name;// �������ʦ����

	public SoftEngineer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void giveBizSpeech() {
		System.out.println("�һὲҵ��");
	}
	public void writeProgram() {
		System.out.println("�һ�д���롣");
	}
}
