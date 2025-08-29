package rahulsettyjava;

public class Nestedforlooptask41 {

	public static void main(String[] args) {
		/*1 2 3 4
		  5 6 7
		  8 9 
		  10*/
		
	   
	        int num = 1;   // starting number
	        int rows = 4;  // total rows

	        for (int i = rows; i >= 1; i--) {   // row length decreases each time
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }
	}


