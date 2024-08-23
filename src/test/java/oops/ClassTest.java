package oops;

import oops.Second;

public class ClassTest {

	int x = 5;
	
	
	public static void main(String[] args) {
		
		// Multiple objects
		ClassTest myObj1 = new ClassTest();  // Object 1
		ClassTest myObj2 = new ClassTest();  // Object 2
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	    
	    // A different class's object
	    Second obj = new Second();
	    System.out.println(obj.x);
	    obj.x = 0;
	    System.out.println(obj.x);
	    obj.y = 5;
	    System.out.println(obj.y);
		
	    
	    // Object specific value update
	    Second obj_1= new Second();
	    Second obj_2 = new Second();
	    obj_1.z = 25;
	    System.out.println(obj_1.z);  // Outputs 5
	    System.out.println(obj_1.z);  // Outputs 25
	    
	    // Multiple Attributes
	    Second myObj_multipleA = new Second();
	    System.out.println("Name: " + myObj_multipleA.fname + " " + myObj_multipleA.lname);
	    System.out.println("Age: " + myObj_multipleA.age);
	    
	    // Accessing methods
	    Second myCar = new Second();     // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method
	    
		

	}

}
