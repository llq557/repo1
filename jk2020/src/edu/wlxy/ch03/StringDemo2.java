package edu.wlxy.ch03;


/*
 * ��Ҫ��ʾ equals  ��   ==  ������
 * ͨ��debugģʽ���۲������id
 * equals �Ƚ������ϵ������Ƿ���ͬ
 * ==     �Ƚϴ洢��λ���Ƿ���ͬ
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Java";
		   String s2 = new String("Java");
		   if (s1 == s2)
		     System.out.println("s1 == s2");
		   else
		     System.out.println("s1 != s2");
         

	}

}
