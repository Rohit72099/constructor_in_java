package practice;

public class Car {
	String make;
	String model;
	
	public void drive() {
		System.out.println("This"+ make + model + "is driving");
	}

//	class codechef{
		
	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.make = "toyota";
		mycar.model = "2023";
		mycar.drive();
		
		
		// TODO Auto-generated method stub

	}

}
