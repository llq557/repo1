package edu.wlxy.ch11;
import java.awt.*;
import javax.swing.*;
class FrameWithGridLayout extends JFrame
{
	void display()
	{
		setTitle("���񲼾ֹ�����ʾ��");
		JTextField text=new JTextField(20);
		add(text, BorderLayout.NORTH);
		
		JPanel p = new JPanel();//����һ��JPanel��������       
		//��JPanel�Ĳ��ֹ���������Ϊ���񲼾ֹ�������
		//����Ϊ4��3�У�����֮���С��м���Ϊ4������
		p.setLayout(new GridLayout(4,3,4,4));
		String[] name = {"1","2","3","4","5","6","7","8","9","*","0","#"};
		for (int i = 0; i < name.length; ++i)
			p.add(new JButton(name[i]));//JPanel�ĸ��������м��밴ť����
		add(p);//��JPanel�������뵽�����У�Ĭ��Ϊ�м�λ��
		pack();//���ô���Ϊ���ʴ�С
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Example13_08
{
	public static void main(String[] args)
	{
		new FrameWithGridLayout().display();
	}
}
