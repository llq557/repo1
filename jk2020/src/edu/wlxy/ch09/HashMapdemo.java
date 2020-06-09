package edu.wlxy.ch09;

import java.util.*;

public class HashMapdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> ma=new HashMap<Integer,String>();
		ma.put(201801, "jack");
		ma.put(201802, "rose");
		
		System.out.println(ma.get(201802));
		Set<Integer> keyset=ma.keySet();
         for(Integer kk:keyset){
         	System.out.println(ma.get(kk));
         }
System.out.println("---------------");
		
		Map countries = new HashMap();
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ڹ�");
		
		String country = (String) countries.get("CN");
		System.out.println("CN��Ӧ�Ĺ����ǣ�" + country);
		
		System.out.println("Map�й���"+countries.size()+"������");
		
		countries.remove("FR");
		System.out.println("Map�а���FR��key��" + 
				countries.containsKey("FR"));
		
		System.out.println( countries.keySet() ) ;
		System.out.println( countries.values() );
		System.out.println( countries );
		
		
		
	}

}
