package edu.wlxy.ch02;

public class DoWhiledemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;//ͳ������ļ�¼����
        int c=80;//���϶�
        double f=0;//�����¶�
		do{
			f=c*9/5.0+32;
			System.out.println(c+"��Ӧ�Ļ����¶���"+f);
			i++;
			c=c+20;
		}while(i<=10 && c<=250);

		
	}

}
