package edu.wlxy.ch09;

import java.util.*;

public class Mapdemo2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String> ();
      map.put(2019001, "������");
      map.put(2019002, "Ǯ��");
      map.put(2019003, "̷��");
      System.out.println("map�Ĵ�С"+map.size());
      System.out.println(map.get(2019002));
      System.out.println("-------------");
      Set<Integer> keyset=map.keySet();
      for(Integer  key:keyset){
    	  System.out.println(map.get(key));
      }
	}

}
