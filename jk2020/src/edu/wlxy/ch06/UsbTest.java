package edu.wlxy.ch06;



/**
 * �����ࡣ
 * @param args
 */
public class UsbTest {	
	public static void main(String[] args) {
		
		//1��U��
		UsbInterface uDisk = new UDisk();
		uDisk.service();
		
		//2��USB����
		UsbInterface usbFan= new UsbFan();
		usbFan.service();
	}
}
