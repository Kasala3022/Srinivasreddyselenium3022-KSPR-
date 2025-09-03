package rahulsettyjava;

public class ReverseString {

	public static void main(String[] args) {
		
		String sr="Srinivas Reddy";
		
		String reversed=new StringBuilder(sr).reverse().toString();
		System.out.println("Reversed String"+": "+reversed);
	}

}
