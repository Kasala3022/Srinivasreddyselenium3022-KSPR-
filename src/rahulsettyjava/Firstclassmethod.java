package rahulsettyjava;

public class Firstclassmethod {
	
	public void getdata() {
		System.out.println("This is the Firstclassmethod");
	}


	public static void main(String[] args) {
		Firstclassmethod fn=new Firstclassmethod();
		fn.getdata();
		
		System.out.println(("Hello"));
		
		Secondclassmethod sc=new Secondclassmethod();
		sc.setdata();

	}

}
