package core;

public class forLoopTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		
		// Break in for loop
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
			  break;
		     }
			  System.out.println(i);
		}
				
				
		// Skip a value
	    for (int k = 0; k < 10; k++) {
			if (k == 4) {
					    continue;
			 }
		    System.out.println(k);
		
	    }
	    
	    // For each loop
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (String i : cars) {
	      System.out.println(i);
	    }

	}

}
