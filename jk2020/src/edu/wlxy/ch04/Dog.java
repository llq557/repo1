package edu.wlxy.ch04;

public class Dog {
	String dogname;
	
    public void bark() {
        System.out.println("������!");
    }

    public void bark(boolean injured) {
        if(injured) {
            System.out.println("����...");
        }
    }
    
    public void bark(int mood){
        if(mood == 0) 		// normal
            System.out.println("��������");
        else if(mood == 1)	//happy
            System.out.println("����������");
        else if(mood == 2) 	//sad
            System.out.println("�أ���");
    }
    
    public static void main(String[] args){
        Dog ahuang = new Dog();
        ahuang.bark();
        ahuang.bark(true);
        ahuang.bark(1);
    }


}
