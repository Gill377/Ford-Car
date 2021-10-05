package gul.gill;

public class Startup {
	public static void main(String[] args) {
		System.out.println("Gulfam");
		
		// constructed new object
		Car gulfamCar = new Car();
		
		// assinging values
		gulfamCar.color = "green";
		
		gulfamCar.specs = "petrolium";
		
		
		// properties
		System.out.println("Car: " + gulfamCar);
		System.out.println("Color: " + gulfamCar.color);
		System.out.println("specs: " + gulfamCar.specs );
		System.out.println("Model: " + gulfamCar.model );
		
		
		Car jeffCar = new Car();
		
		jeffCar.color = "white";
		
		jeffCar.specs = "Gas";
		
		System.out.println("Car: " + jeffCar);
		System.out.println("Color: " + jeffCar.color);
		System.out.println("specs: " + jeffCar.specs );
		System.out.println("Model: " + jeffCar.model);
		
		
		// method
		gulfamCar.start();
		jeffCar.start();
		gulfamCar.speedup();          
		jeffCar.slowdown();
		gulfamCar.speedup();
		gulfamCar.speedup();
		jeffCar.speedup();
		
		System.out.println("Gulfam Speed: " + gulfamCar.speed);
		System.out.println("Jeff Speed: " + jeffCar.speed );
		
		
		
		
		
		
		
		
		
		
		
//		int sum = add(5, 9);
//		System.out.println("Sum: " + sum);
		
//		for (int i = 0; i < 10; i++) {
//			Car loopCar = new Car();
//			loopCar.color = "red";
//			loopCar.specs = "petrolium - " + i;
//			System.out.println("Car: " + loopCar);
//			System.out.println("Color: " + loopCar.color);
//			System.out.println("specs: " + loopCar.specs );
//		}
		
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
}