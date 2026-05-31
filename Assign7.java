package practice;

//parent class vehicle
class Vehicle{
	public void detail() {
		String color = "BLACK";
		String brand = "LAMBORGHINI";
		System.out.println(color + "\n " + brand);
	}
}

//child class bike
class Bike extends Vehicle{
	void bikeInfo() {
		System.out.println("I'm a bike");
	}
}

//child class car
class Car extends Vehicle{
	void carInfo() {
		System.out.println("I'm a car");
	}
}

public class Assign7{
	public static void main(String[] args) {
		Bike bike = new Bike(); 
		bike.bikeInfo();        
		bike.detail();
		
		Car car = new Car();
		car.carInfo();
		car.detail();
	}
}
/*
 * OUTPUT
 * ..................
 * I'm a bike
 * BLACK LAMBORGHINI
 * I'm a car
 * BLACK LAMBORGHINI
 * ..................
 */
