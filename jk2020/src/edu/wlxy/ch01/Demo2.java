package edu.wlxy.ch01;
/*
 * ��ʾ���ݶ��塢��������
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
      double a=12.45;
	  float b=12.46f;
	  double c=200;//(�漰�Զ�����ת��  int---> double)
	  float d=100;
	  String  name="�ŷ�";
	  char  sex='��';
	  String sex2="��";
	  System.out.println("name��ֵ�ǣ�"+name);// �˴� + ��ʾ����
		System.out.println("-------------------");
		int n1=5;
		int n2=2;
		int n5=-2;
		double  n3=5.2;
		float n4=5;
		
		//��+ - * / �����У������������2��������int,����Ҳ��int
		//��+ - * / �����У������������2������ֻҪ��һ����С����double,float��,����Ҳ��С����
		System.out.println(n1/n2);
		System.out.println(n3+n2);
		System.out.println(n4/n2);
		System.out.println("------%%%%%%%%------");
		// % ������ �� ��c������Ҫ�����%����Ķ���int������javaû�����Ҫ��
		//  ���������������⣺ ��%ǰ���������������һ����
		System.out.println(n1%n2);
		System.out.println(n1%n5);
		
		System.out.println(-5%n2);
		System.out.println(-5%n5);
		System.out.println("-----++++++++-------");
		// ++   --  �����Լ�+1   ���� -1
		// ++  --  �ڱ���ǰ �������������Ⱥ���ͬ����������ɴ���
		// ���Ǿ������ڱ��ʽ��ʹ��++  --
		n1++;
		n2--;
		System.out.println(n1++);
		System.out.println(n2);
		
		//��������ı�ǣ�������Ĵ�Ľ���
		double  x1=45.8;
		System.out.println(x1);
		
	}

}
