package edu.wlxy.ch09;

import java.util.*;

import edu.wlxy.ch04.Person;
//set ���������ظ�ֵ
public class HashSetdemo2 {

	public static void main(String[] args) {
		HashSet<String>  hs=new HashSet<String>();
		hs.add("abc");
		hs.add("ab");
		hs.add("ac");
		hs.add("ab");
		System.out.println(hs.size());
		System.out.println(hs);
	
		for(String xx:hs){
			System.out.println(xx);
		}
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		Person  p1=new Person("jack",18);
		Person  p2=new Person("rose",18);
		Person  p3=new Person("jack",18);
		Person  p4=p2;
		// p1��p3�洢��λ���ǲ�ͬ��ֵ��ͬ�ġ�  p2��p4 ��ͬһ������λ�ÿ϶���ͬ
//		set ˵Ԫ�ز����ظ������Զ��ж��Ƿ��ظ����жϱ�׼ �ǱȽϴ洢λ�á�
		HashSet<Person>  hsp=new HashSet<Person>();
		hsp.add(p1);
		hsp.add(p2);
		hsp.add(p3);
		hsp.add(p4);
		System.out.println(hsp.size());
		System.out.println(hsp);//���������������ȡ
		Iterator it2=hsp.iterator();
		while(it2.hasNext()){
			Person p=(Person)it2.next();
			p.showInfo();
		}
	}

}
