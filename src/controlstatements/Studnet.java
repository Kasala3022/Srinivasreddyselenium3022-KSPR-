package controlstatements;

public class Studnet {
	
	String name;
	
	int rollno;
	
	Studnet(){
		name ="Srinivas reddy";
		 rollno=302;
	}

	public static void main(String[] args) {
		
		Studnet s=new Studnet();
		
		System.out.println(s.name);
		
		System.out.println(s.rollno);

	}

}
