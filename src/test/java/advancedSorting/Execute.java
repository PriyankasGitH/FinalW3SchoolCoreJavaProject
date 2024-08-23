package advancedSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Execute {

	public static void main(String[] args) {
		 ArrayList<Car> myCars = new ArrayList<Car>();    
		    myCars.add(new Car("BMW", "X5", 1999));
		    myCars.add(new Car("Honda", "Accord", 2006));
		    myCars.add(new Car("Ford", "Mustang", 1970));

		    // Use a comparator to sort the cars
		    Comparator myComparator = new ComparatorTest();
		    Collections.sort(myCars, myComparator);

		    // Display the cars
		    for (Car c : myCars) {
		      System.out.println(c.brand + " " + c.model + " " + c.year);
		    }

	}

}
