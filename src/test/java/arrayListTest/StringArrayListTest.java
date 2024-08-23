package arrayListTest;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class StringArrayListTest {

	public static void main(String[] args) {
	
		// Create an ArrayList object
		ArrayList<String> cars = new ArrayList<String>(); 
		
		// Add items
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    // Insert an item
	    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
	    System.out.println(cars);
	    
	    // Access an item
	    cars.get(0);
	    
	    // Change an Item
	    cars.set(0, "Opel");
	    
	    // Remove an Item
	    cars.remove(0);
	    
	    // Clear an array list
	    cars.clear();
	    
	    // ArrayList size
	    cars.size();
	    
	    // Loop through an array list
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    
	    // For each loop
	    for (String i : cars) {
	        System.out.println(i);
	      }
	    
	    // Sort an array List
	    Collections.sort(cars);  // Sort cars
	    for (String i : cars) {
	      System.out.println(i);
	    }

	}

}
