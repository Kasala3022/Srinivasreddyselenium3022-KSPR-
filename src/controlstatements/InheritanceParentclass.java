package controlstatements;

public class InheritanceParentclass {
	int i=2;
	class Vehicle {
		String brand="Toyota";
	}
	
	void clour() {
		System.out.println("blue");
	}

	public void vehicletype() {
		if(i<=2) {
			System.out.println("Electric");
			
		}
		else {
			System.out.println("Petrol");
		}
	}
	public static void main(String[] args) {
		
		InheritanceParentclass s=new InheritanceParentclass();
		s.clour();
	
			}

}
