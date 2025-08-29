package controlstatements;

public class Returns3three3 {
	
	int a=10;
	int b=20;
	
	public int add(int a, int b) {
	    return a + b;
	}


	public static void main(String[] args) {
		
		Returns3three3 s=new Returns3three3();
		int p=s.add(10, 20);
		System.out.println(p);
	}

}
