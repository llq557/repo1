package edu.wlxy.ch11;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFramedemo5 {

	public MyFramedemo5(){
		JFrame jf=new JFrame();
		jf.setTitle("����");
		jf.setSize(600, 300);
		//jf.setLocation(200, 400);//���ô��ڵ�λ��
		jf.setLocationRelativeTo(null);//���ô�������Ļ��������
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرհ�ť�Ĺ���
		jf.setBackground(Color.red );
		jf.setVisible(true);// �������ÿɼ���
		
//		����С�����
		JButton jbu1=new JButton();
		JButton jbu2=new JButton();
		JButton jbu3=new JButton("ɳ����");
		JButton jbu4=new JButton("�׹Ǿ�");
		JButton jbu5=new JButton("�϶�");
		jbu1.setText("�����");
		jbu2.setText("��˽�");
		
		// 1 ����
		// 2 �������
		// 3 ���֣�  ��������ڴ�������ΰڷ�
//		3.1 ���ô��ڵĲ��ֹ�����
		jf.setLayout(new GridLayout(2,3));
		
	  //	3.2�������ӵ�������
		jf.getContentPane().add(jbu1);
		jf.getContentPane().add(jbu2);
		jf.getContentPane().add(jbu3);
		jf.getContentPane().add(jbu4);
		jf.getContentPane().add(jbu5);

	}
		
		
		public static void main(String[] args) {
			new MyFramedemo5();

		}

}
