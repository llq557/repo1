package edu.wlxy.ch11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class myframedemo4 extends JFrame implements ActionListener{
	JButton jbutton1;
	private JButton jbutton2;
	private JButton jbutton3;
	private JButton jbutton4;
	private JButton jbutton5;
	JLabel  jLb1,jLb2;
	public myframedemo4() {
		 JFrame  jf=new JFrame();
         jf.setTitle("�ҵĵ�2������");//���ô��ڵı���
         jf.setSize(400, 400);//���ô��ڵĳߴ��С
         jf.setVisible(true);//Ĭ��״̬�����������صģ���Ҫ���ô��ڱ�����ʾ
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���õ���رհ�ťʱ�Ĵ���취
         jf.setLocationRelativeTo(null);//�ô�������Ļ�����м�
         
         //2 �������
         // ����5����ť
         jbutton1=new JButton("��а");
         jbutton2 = new JButton("����");
         jbutton3 = new JButton("�ϵ�");
         jbutton4 = new JButton("��ؤ");
         jbutton5 = new JButton("����ͨ");
         jLb1=new JLabel("������ť����");
         
         
         
         // 3 ������ڷŵ�������
      //��ʾ�����ַ�ʽ
        // 3.1 �������ô��������Ĳ��ַ�ʽ
          jf.setLayout(new FlowLayout());//������ 
         // 3.2 ��������������
          jf.getContentPane().add(jLb1);
         jf.getContentPane().add(jbutton1); //�����������ͨ��add()������ӵ�������
         jf.getContentPane().add(jbutton2);
         jf.getContentPane().add(jbutton3);
         jf.getContentPane().add(jbutton4);
         jf.getContentPane().add(jbutton5);
         
         
         // ��Ӽ�����
         jbutton1.addActionListener(this);
         jbutton2.addActionListener(this);
         
      
	}
	public static void main(String[] args) {
		new myframedemo4();

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbutton1){
			jbutton1.setText("���书��һ");
			jbutton2.setText("�����");
			jLb1.setIcon(new ImageIcon("jie.PNG"));
			
		}
		else if(e.getSource()==jbutton2){
			jbutton3.setIcon(new ImageIcon("gedaye.jpg"));
		}
		
		
		
		//jbutton1.setRolloverIcon(new ImageIcon("baby.jpg"));
	    //jbutton1.setPressedIcon(new ImageIcon("jie.PNG"));
		
	}

}
