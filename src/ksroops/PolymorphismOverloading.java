package ksroops;

public class PolymorphismOverloading {
	
	int add(int a,int b) {
		return a+b;
	}

	
	 double add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		PolymorphismOverloading cal=new PolymorphismOverloading();
		
		System.out.println(cal.add(5, 3));
		System.out.println(cal.add(1, 2, 3));
		
		
	}

}
