package edu.wlxy.ch04;
// ��Chinese ��country  ǰ ��ӻ���� static  ���۲� ch1  ��  ch2   �������ı仯
//static ȫ�ֱ��� �ĺ���
public class ChineseTest {

	public static void main(String[] args) {
		// ��̬��������̬����������ֱ��ͨ�� ��   ����.��̬����     ����.��̬����  ʹ��
		System.out.println("ֱ��ʹ������ʹ�ã�"+Chinese.country);
		Chinese.sing();
		
     	Math.sqrt(45);
     	Math.random();
		   System.out.println("++++++++++++++++++++");
		Chinese ch1=new Chinese();
		
		System.out.println("ͨ��ʵ��������ʹ�ã�"+ch1.country);
		ch1.singOurCountry();
        ch1.sing();
        System.out.println("+++ֵ����֮��++++");
		ch1.country="�й�";  //�ı�country��ֵ
          ch1.singOurCountry();
          ch1.sing();
          
          System.out.println("-----");
          Chinese ch2=new Chinese();
        // ch2.country="���й�";
          ch2.singOurCountry();  //
          ch2.sing();
          System.out.println("-----");
          
          ch1.sing();
	}

}
