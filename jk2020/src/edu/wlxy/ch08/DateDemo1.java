package edu.wlxy.ch08;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.*;


public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date1=new Date();
System.out.println(date1);
System.out.println(date1.getTime());//��ǰ���ھ���1970/1/1 0ʱ ���ٺ���
//��Щ�������к��ߣ���ʾ�÷�����ʱ�ˣ����Ƽ�ʹ�ã�����ʹ����������򷽷������档����ʹ�ò�Ӱ��Ч����Ϊ�����¼��ݡ�
//getMonth()  �·�  ��0��ʼ����
//getDate()   ����  ��1��ʼ����
System.out.println(date1.getYear());//  2020-1900
System.out.println("�·ݣ�"+date1.getMonth());
System.out.println("������"+date1.getDate());
System.out.println("-------111--------");
SimpleDateFormat sf1=new SimpleDateFormat();
System.out.println(sf1.format(date1));
SimpleDateFormat sf2=new SimpleDateFormat("yyyy��M��dd��  EEE");
System.out.println(sf2.format(date1));
System.out.println("-------222--------");
Calendar ca=new GregorianCalendar();
System.out.println(ca.get(Calendar.YEAR));
System.out.println("�·�"+ca.get(Calendar.MONTH));
System.out.println(ca.get(Calendar.DATE));

Clock  cl= Clock.systemUTC();
System.out.println(cl.instant());

	}

}
