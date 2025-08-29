package ksroops;

public class Variables {
	
	static int c=30;//static variable
    int a=10;//instance variable
    
	public static void main(String[] args) {
		int b=20; //local variable
		
		Variables s=new Variables();//object creation
		
	System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);

	}

}
