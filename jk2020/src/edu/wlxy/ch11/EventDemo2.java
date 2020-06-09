package edu.wlxy.ch11;
/*
 * ��ʾ �¼����� ���� ��3��д��
 * 1. ��ͬ1�����У�ֱ��ʵ���¼��ӿڵķ�����
 * 2. �½�1���࣬ ���½�����ʵ�� �¼��ӿڵķ�����
 * 3. ���������ڲ���ķ�ʽ����д�¼��ӿ��еķ�����  ����
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo2 extends JFrame implements ActionListener{
	private JButton jbu2;
private JButton jbu3;
private JButton jbu1;


public EventDemo2(){
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
	
	JButton jbu4=new JButton("�׹Ǿ�");
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
	jf.getContentPane().add(jbu4);
//	4.1Ҫ�󣺵�������հ�ť������˽䰴ť ��� ������
	jbu1.addActionListener(this);//��Ӽ�����
	
//	Ҫ��  ������2����ť��ť�����ڶ�����ť ��� �϶�	
	jbu2.addActionListener(new MyButtonAction2());
	
//	Ҫ��  ����ɳ���а�ť�����ڶ�����ť ��� ������
    jbu3.addActionListener(this);
    
//	Ҫ��  �����׹Ǿ���ť����jbu4��� ֩�뾫    
//  �¼�����ʽ3�������ڲ���
    jbu4.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("�����˰׹Ǿ���ť");
			jbu4.setText("֩�뾫");
		}
    	
    });
    
}
//4.2 �¼�������
@Override
//  �¼�����ʽ1
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
		new EventDemo2();

	}

}
//�¼�����ʽ2
class MyButtonAction2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("�����˵�2����ť");
		
	}
	
}



