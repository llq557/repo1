package edu.wlxy.ch02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CDemo {
	public static void main(String[] args) {
		int score; 		// �ɼ�
		int total; 		// �༶������
		int num = 0; 	// �ɼ����ڻ����80�ֵ�����
		Scanner input = new Scanner(System.in);
		System.out.print("����༶������: ");
		String st=JOptionPane.showInputDialog(
				null,"��������,�ÿո�ָ�","����Ի���", JOptionPane.PLAIN_MESSAGE);
		total = Integer.parseInt(st); 	// ����༶����
	//	total = input.nextInt(); 	// ����༶����
		for (int i = 1; i <=total; i++) {
			System.out.print("�������" + i + "λѧ���ĳɼ��� ");
			score = input.nextInt();
			if (score < 80) {
				continue;
			}
			num++;
		}
		System.out.println("80�����ϵ�ѧ�������ǣ� " + num);
		double rate = (double) num / total * 100;
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��" + rate + "%");
	}
}


