package edu.wlxy.ch02;

/*
 *��ѧ���Ŀ��Գɼ�����
 *�ɼ�>=80 ������ 
 *�ɼ�>=60 ���е�
 *�ɼ�<60   ����

 * 
 */
public class MulIfdemo1 {

	public static void main(String[] args) {
		int  score=75;
		if(score>=80){
			System.out.println("��");
		}
		else if(score>=60 && score<80){
			System.out.println("��");
		}
		else if(score<60){
			System.out.println("��");
		}
	}

}
