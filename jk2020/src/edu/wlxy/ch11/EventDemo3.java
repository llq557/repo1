package edu.wlxy.ch11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo3 extends JFrame implements MouseListener {
	private JButton jbu2;
private JButton jbu3;
private JButton jbu1;


public EventDemo3(){
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
//	4.1Ҫ�󣺵�������հ�ť������˽䰴ť ��� ������  �������������������
//	jbu1.addActionListener(this);//��Ӷ���������
	jbu1.addMouseListener(this);
//	Ҫ��  ����ɳ���а�ť�����ڶ�����ť ��� ������ ,�����������������,���������ڲ���ķ�ʽ��д
//    jbu3.addActionListener(this);
//	java�¼�������¼������� �ࡣ
//	��ǰ�¼��ӿ��е����з������ǳ��󷽷���������5�����Ǿͱ�����д5���������������ü�����������д5����
//	�¼��������࣬ ������5���շ���������1����д1������2����д2���������˴������д����
	jbu3.addMouseListener(new MouseAdapter(){
		@Override
		public void mousePressed(MouseEvent e) {
			jbu2.setText("������");
		}
	});
}


	
	
	public static void main(String[] args) {
		new EventDemo3();

	}
//4.2 �¼�������
//	��ΪMouseListener�ӿ�����5�����󷽷���ʵ��������� ��д ��5��������
	@Override
	public void mouseClicked(MouseEvent e) {
//		���� ����2������ �����£��ͷ� ���
		System.out.println("mouseClicked");
		jbu2.setText("������1");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		 ����1������ ������ ���
		System.out.println("mousePressed");
		jbu2.setText("������2");
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	

}
