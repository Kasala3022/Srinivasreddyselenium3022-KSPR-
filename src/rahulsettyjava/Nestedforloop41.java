package rahulsettyjava;

public class Nestedforloop41 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4;i++) {//out loop
			System.out.println("outer loop started");
			
			for(int j=1; j<=4; j++) {//inner loop
				System.out.println("Inner loop ");
			}
			
			System.out.println("outer loop ended");
		}

	}

}
