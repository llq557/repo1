package edu.wlxy.ch02;
/*
 * �����򳵣���ʲô�����������������ж��ٴ��
����ҵĴ���500���Ҿ��򿭵�����
��������ҵĴ���100���Ҿ���������
���� ����ҵĴ���50���Ҿ���������
���� ����ҵĴ���10���Ҿ������
���� ����ҵĴ��10������ ������ݰ���

 * 
 */
public class MulIfdemo2 {

	public static void main(String[] args) {
		int money = 780; // �ҵĴ���λ����Ԫ��
//		if (money >= 500) {
//			System.out.println("̫���ˣ��ҿ����򿭵�����");
//		} else if (money >= 100) {
//			System.out.println("�����ҿ�������������");
//		}else if (money >= 50) {
//			System.out.println("�ҿ�������������");
//		}  else if (money >= 10) {
//			System.out.println("�����ҿ����������");
//		} else  if (money < 10){
//			System.out.println("��������ֻ������ݰ�����");
//		}

		
	

		if (money < 10){
			System.out.println("��������ֻ������ݰ�����");
		} else if (money <50 ) {
			System.out.println("�����ҿ����������");
		} else if (money <100) {
			System.out.println("�ҿ�������������");
		}else if (money <500) {
			System.out.println("�����ҿ�������������");
		}else if (money >= 500) {
			System.out.println("̫���ˣ��ҿ����򿭵�����");
		}
		
	}

}
