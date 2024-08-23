package arrayListTest;
import java.util.Collections;  // Import the Collections class

import java.util.ArrayList;

public class IntegerarrayList {

	public static void main(String[] args) {
		
		  // Integer array list
		  ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		  myNumbers.add(10);
		  myNumbers.add(15);
		  myNumbers.add(20);
		  myNumbers.add(25);
		  for (int i : myNumbers) {
		      System.out.println(i);
		    }
		  
		  Collections.sort(myNumbers);  // Sort myNumbers

		    for (int i : myNumbers) {
		      System.out.println(i);
		    }
		  
		  
		
		
		

	}

}
