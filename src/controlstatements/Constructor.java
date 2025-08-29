package controlstatements;

public class Constructor {
	String name;
	int rollno;
	Constructor(){//Default Constructor
		 name="Sri";
		 rollno=302;	
		}
	Constructor(String str,int n){//parametarized Constructor
		 name=str;
		 rollno=n;	
		}
	

	public static void main(String[] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor("pragathi",123);
		
		System.out.println(c1.name);
		System.out.println(c1.rollno);
		System.out.println(c2.name);
		System.out.println(c2.rollno);
	}

}
