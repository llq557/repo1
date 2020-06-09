package edu.wlxy.ch11;

import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class MyLayoutdemo extends JFrame {

	public MyLayoutdemo(){
		JFrame jf=new JFrame();
		jf.setTitle("����");
		jf.setSize(600, 300);
		//jf.setLocation(200, 400);//���ô��ڵ�λ��
		jf.setLocationRelativeTo(null);//���ô�������Ļ��������
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//���ùرհ�ť�Ĺ���
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
//		���� ��ͨ����  
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.green);
//		3.1 ���ô��ڵĲ��ֹ�����
		jp1.setLayout(new GridLayout(2,3));
	  //	3.2�������ӵ�������
		jp1.add(jbu1);
		jp1.add(jbu2);
		jp1.add(jbu3);
		jp1.add(jbu4);
		jp1.add(jbu5);

		JPanel jp2=new JPanel();
		jp2.setBackground(new Color(100,120,50));
		JButton jbu6=new JButton("����");
		JButton jbu7=new JButton("����");
		jp2.setLayout(new FlowLayout());
		jp2.add(jbu6);
		jp2.add(jbu7);
		
		jf.setLayout(new BorderLayout());
		jf.getContentPane().add(jp1,BorderLayout.NORTH);
		jf.getContentPane().add(jp2,BorderLayout.CENTER);
	}
		
		
		public static void main(String[] args) {
			new MyLayoutdemo();

		}

}
