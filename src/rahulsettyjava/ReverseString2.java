package rahulsettyjava;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String sr="Srinivas Reddy";
		
		String reversed = "";
		
	
		
			for (int i = sr.length() - 1; i >= 0; i--) {
				
				reversed  +=sr.charAt(i);
			
		}
System.out.println("Reverse String"+ ": "+ reversed);
	}
}


