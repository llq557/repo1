package edu.wlxy.ch11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo1 extends JFrame implements ActionListener{
	private JButton jbu2;
private JButton jbu3;
private JButton jbu1;


public EventDemo1(){
	JFrame jf=new JFrame();
	jf.setTitle("����");
	jf.setSize(600, 300);
	//jf.setLocation(200, 400);//���ô��ڵ�λ��
	jf.setLocationRelativeTo(null);//���ô�������Ļ��������
	jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//���ùرհ�ť�Ĺ���
	jf.setVisible(true);// �������ÿɼ���
	
jbu1 = new JButton();
	jbu2=new JButton();  //�ֲ���������ת��Ϊ  ��Ա����  �� ctrl+1  , convert  local  to field
	jbu3 = new JButton("ɳ����");
	
	jbu1.setText("�����");
	jbu2.setText("��˽�");
	
	// 1 ����
	// 2 �������
	// 3 ���֣�  ��������ڴ�������ΰڷ�
//	  4  �¼� ��ĳ�����������󣬸�����Щ���顣
//	3.1 ���ô��ڵĲ��ֹ�����
	jf.setLayout(new FlowLayout());
  //	3.2�������ӵ�������
	jf.getContentPane().add(jbu1);
	jf.getContentPane().add(jbu2);
	jf.getContentPane().add(jbu3);
//	4.1Ҫ�󣺵�������հ�ť������˽䰴ť ��� ������
	jbu1.addActionListener(this);//��Ӽ�����
//	Ҫ��  ����ɳ���а�ť�����ڶ�����ť ��� ������
    jbu3.addActionListener(this);
}
//4.2 �¼�������
@Override
public void actionPerformed(ActionEvent e) {
//	��������¼�Դ��
//	��2�ַ�ʽ
//	��ʽ1  e.getSource()��ȡ�¼�Դ�� �ؼ�����
	if(e.getSource()==jbu1){
	System.out.println("�㵥��������հ�ť��");
	jbu2.setText("������");
	}
//��ʽ2  e.getActionCommand() ��ȡ�¼�Դ�� ��ʾ��������Ϣ
	else if(e.getActionCommand().equals("ɳ����")){
		System.out.println("�㵥����ɳ���пհ�ť��");
		jbu2.setText("������");
	}
}
	
	
	public static void main(String[] args) {
		new EventDemo1();

	}



	

}
