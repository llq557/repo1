package edu.wlxy.ch09;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
//list  ��һ�����ȿɱ仯�� �������顣
//	һ��list�п��Դ洢�������͵����ݣ���Ϊlist��Դ������ʹ�÷����������д
//	list ����洢�ظ�ֵ������ŵġ�
	public static void main(String[] args) {
	ArrayList alist=new ArrayList();
	alist.add("����");
	alist.add("�����ӳ�");
	alist.add("�̾���");
	alist.add("����ֵ�");
	alist.add(789);
	alist.add("����");
	System.out.println("alist������"+alist.size());
	for(int i=0;i<alist.size();i++){
		System.out.println(alist.get(i));
	}
	alist.add(1,"������");
	alist.remove(0);
	System.out.println("alist������"+alist.size());
	for(int i=0;i<alist.size();i++){
		System.out.println(alist.get(i));
	}
	
	
	
	System.out.println("------------------");
//	ArrayList<String> blist  ����blist ��ֻ�ܴ��String ���͵����ݡ�
	ArrayList<String> blist=new ArrayList<String>();
	blist.add("����");
	blist.add("�����ӳ�");
	blist.add("�̾���");
	blist.add("����ֵ�");
	//blist.add(789);
	blist.add("����");
	System.out.println("blist������"+blist.size());
	System.out.println("-----����1----");
//	��������Ԫ��  ����1
	for(int i=0;i<blist.size();i++){
		System.out.println(blist.get(i));
	}
	System.out.println("-----����2----");
//	��������Ԫ��  ����2	 foreach
	for(String xx:blist){
		System.out.println(xx);
	}
	System.out.println("-----����3----");
//	��������Ԫ��  ����3	java�������ר�õĵ���������ɼ��ϵı���
	Iterator it=blist.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
