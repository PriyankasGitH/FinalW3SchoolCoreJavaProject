package oops;

public class ClassMethods {

	
	static void myMethod() {
	    System.out.println("Hello World!");
	  }
	
	
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
		
	  }
	
	public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  
	  }
	
	public static void main(String[] args) {
	
		myMethod();
		myStaticMethod(); 
		
		
		ClassMethods myObj = new ClassMethods(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method on the object

	}

}
