package edu.wlxy.ch02;

public class WhileExec1 {
/*
 * 2019��ѧԺ��ѧ��0.8���ˣ�ÿ������15%��
 * ���ʰ��������ٶȣ�����һ��ѧ���������ﵽ1.3���ˣ�

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  year=2019;
   int stuCount=8000;
   while(stuCount<=13000){
	  stuCount=(int) (stuCount*(1+0.15));
	  year++;
	  System.out.println(year+"�꣬��"+stuCount+"��ѧ����");
   }
		
	System.out.println(year);	
		
	}

}
