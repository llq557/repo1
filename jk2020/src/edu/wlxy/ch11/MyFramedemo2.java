package edu.wlxy.ch11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFramedemo2 extends JFrame implements ActionListener {
private JButton jbu2;
private JButton jbu1;

public MyFramedemo2(){
	 JFrame  jf=new JFrame();
	   jf.setTitle("����");
	   jf.setSize(300,200);
	   jf.setLocation(300, 500);
	   jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//���ô��ڵĹر� ����
     jf.setVisible(true);//����Ҫ���� �ɼ���
     
     
     jbu1 = new JButton();
     jbu2 = new JButton();
     JButton  jbu3=new JButton("ɳ����");
     jbu1.setText("�����");
     jbu2.setText("��˽�");
     
     JPanel jpa1=new JPanel();
     jpa1.setBackground(new Color(100,100,100));
    jpa1.setLayout(new FlowLayout());
    jpa1.add(jbu1);
    jpa1.add(jbu2);
    jpa1.add(jbu3);
    
    jf.add(jpa1);
    
//    �¼�����
//    ��������հ�ť����˽� ��ť ��� ������
    jbu1.addActionListener(this);
//    ����ɳ���а�ť����2����ť��� �����ء�  
    jbu3.addActionListener(this);
}
//�¼�������
@Override
public void actionPerformed(ActionEvent e) {
	// ��������¼�Դ��
//	��2�ַ���
//	����1��e.getSource() ȷ���¼�Դ������
	if(e.getSource()==jbu1){
	System.out.println("�㵥��������հ�ť��");
	jbu2.setText("������");
	}
//	����2��e.getActionCommand() ��ȡ�¼�Դ�ؼ� �ϵ�����
	if(e.getActionCommand().equals("ɳ����")){
		System.out.println("�㵥����ɳ���а�ť��");
		jbu2.setText("������");
	}
	
}
	
	public static void main(String[] args) {
		new MyFramedemo2();

	}


	

}
