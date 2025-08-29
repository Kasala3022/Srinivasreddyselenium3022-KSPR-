package controlstatements;

public class ReverseString {

	public static void main(String[] args) {
		
		
		        String str = "Hello World";

		      
		        String reversed=new StringBuilder(str).reverse().toString();
		        
		        System.out.println("Original: " + str);
		        System.out.println("Reversed: " + reversed);
		        
		        //or
		        
		     
		                String str2 = "Hello World";
		                String reversed1 = "";

		                for (int i = str.length() - 1; i >= 0; i--) {
		                    reversed1 += str.charAt(i);
		                }

		                System.out.println("Original: " + str);
		                System.out.println("Reversed: " + reversed1);
		                
		                //or
		                
		               
		                        String str3 = "Hello World";
		                        char[] chars = str3.toCharArray();

		                        for (int i = chars.length - 1; i >= 0; i--) {
		                            System.out.print(chars[i]);
		                        }
		                    }
		                

		            }
		        

		    
		


	//or


