package edu.wlxy.ch02;

public class MulIfExec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int money=90;
        double zhekou=1;
        
		String  huiyuan="n";
		
		//  ==  �������ֱȽ��Ƿ����
//		   equals  ���ڱȽ��ַ����Ƿ����
		
		if(huiyuan.equals("y")){
			System.out.println("��Աר��");
			if(money>200){
				zhekou=0.75;
			}else{
				zhekou=0.8;
			}
		}else{
			System.out.println("�ǻ�Աר��");
			if(money>=100){
				zhekou=0.9;
			}
				
		}
		
		System.out.println("��Ҫ���"+money*zhekou);
		
		
		
		
		
	}

}
