package controlstatements;

class Car{
	String brand;
	int year;
	
	void displaycar() {
		System.out.println("Brand:"+brand+",Year:"+year);
	}
}
public class ClassandObjectinjava {
	
	
	
	public static void main(String[] args) {
		Car mycar=new Car();
		mycar.brand="Toyota";
		mycar.year=2014;
		
		mycar.displaycar();
		
		
		Car secondCar=new Car();
		secondCar.brand="Honda";
		
		secondCar.year=2023;
		secondCar.displaycar();
	}

}
