package edu.wlxy.ch02;

public class SwitchExec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int  score=92;
  switch(score/10){
  case 0:
  case 1:
  case 2:
  case 3:
  case 4:
  case 5:
	  System.out.println("û�н���");
	  break;
  case 6:
  case 7:
  case 8:
	  System.out.println("�����ֻ�");
	  break;
  case 9:
	  System.out.println("�����ʼǱ�����");
	  break;
  case 10:
	  System.out.println("��������");
	   break;
  default:
	  System.out.println("����ĳɼ�������Χ");
	  break;
  
  }
	}

}
