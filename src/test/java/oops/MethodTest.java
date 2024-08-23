package oops;

public class MethodTest {

	 // Static method : Without parameters
	 static void myMethod() 
	 {
		 
		    System.out.println("I just got executed!");
	 }
	
	 
	// Static method : With single parameters
	static void myMethodWithSingleParam(String fname) 
	{
		    System.out.println(fname + " Refsnes");
		  
	}
	 
	// Method will multiple parameters 
	 static void myMethodMultipleParam(String fname, int age) {
		    System.out.println(fname + " is " + age);
		  }
	
	 // Method with if else
	 static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }

		  }

	 
	 // Method with return type
	 static int myIntMethod(int x) {
		    return 5 + x;
		  
	 }
	 
	 // Method with return type & multiple parameters
	 static int myIntMethodAddition(int z, int w) {
	    return z + w;
	  }
	 
	 public static void main(String[] args) {
		
		
		 // Static method call without parameters
		 myMethod();
		 myMethod();
		 myMethod();
		 
		 // Static method call with single parameter
		 myMethodWithSingleParam("Liam");
		 myMethodWithSingleParam("Jenny");
		 myMethodWithSingleParam("Anja");
		 
		 // Static method call with multiple parameter
		 myMethodMultipleParam("Liam", 5);
		 myMethodMultipleParam("Jenny", 8);
		 myMethodMultipleParam("Anja", 31);
		 
		 // If else method call
		 checkAge(20);
		 
		 // Int method call
		 System.out.println(myIntMethod(3));
		 
		 
		 // Int addition method call
		 System.out.println(myIntMethodAddition(2,2));
		 
	}

}
