package edu.wlxy.ch02;

public class ForDemo3 {
/*
 * ����ӷ���
ʹ��forѭ��
1. ѭ����ʼ����i = 0��j = ����ֵ
2. ѭ��������i<=����ֵ
3. ѭ������������i+j
4. ѭ�������ĸı䣺i++��j--

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
   for(int i=0,j=n;   i<=n;   i++,j--){
	   System.out.println(i+"+"+j+"="+(i+j));
   }
	}

}
