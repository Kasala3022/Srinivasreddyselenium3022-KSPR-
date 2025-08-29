package ksroops;

public class Staticblock {
	
	static int a=10;//static variable
	
	//static String s="ram";
	
	static void display() {//static method
		System.out.println("Static method");
	}
	
	static {//Static Block
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		System.out.println(a);
		
	//	System.out.println(s);
		display();
		System.out.println(Variables.c);
	}
	

}
