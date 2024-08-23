package oops;

public class ConstructorTest {
	
	    int x;  // Create a class attribute
	
		 public ConstructorTest() {
		    x = 5;  // Set the initial value for the class attribute x
		  }
	
		 public ConstructorTest(int y) {
			    x = y;
			  }

		 
		 int modelYear;
		  String modelName;

		  public ConstructorTest(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }
	
	
	public static void main(String[] args) {
		
		
		ConstructorTest myObj = new ConstructorTest(); // Create an object of class Main (This will call the constructor)
		System.out.println(myObj.x); // Print the value of x

		
		ConstructorTest myObj2 = new ConstructorTest(0);
		System.out.println(myObj.x);
		
		
		ConstructorTest myCar = new ConstructorTest(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
		
		
		
	}

}
