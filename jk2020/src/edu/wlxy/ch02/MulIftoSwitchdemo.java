package edu.wlxy.ch02;

/*
 * ���̲μӼ������̴���
�����õ�һ�������μ���ʡ����ѧ��֯��1��������Ӫ
�����õڶ��������������ձʼǱ�����һ��
�����õ��������������ƶ�Ӳ��һ��
���򣬲����κν���

ʹ�ö�� if �������
 */
public class MulIftoSwitchdemo {

	public static void main(String[] args) {

		int mingCi = 5;    //����
        if (mingCi == 1) {
            System.out.println("�μ���ʡ����ѧ�����ѧԺ��֯1��������Ӫ");
        } else if (mingCi == 2) {
            System.out.println("����hp�ʼǱ�һ��");
        } else if (mingCi == 3) {
            System.out.println("�����ƶ�Ӳ��һ��");
        } else {
            System.out.println("û���κν���");
        }

	}


}
