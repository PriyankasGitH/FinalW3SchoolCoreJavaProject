package CommonExamples;
import java.util.HashMap;


public class HashMapLoop {

	public static void main(String[] args) {
		
		 	HashMap<String, String> capitalCities = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    
		    // Print keys
		    for (String i : capitalCities.keySet()) {
		    	  System.out.println(i);
		    	}
		    
		    // Print values
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
		    }
	
	
		    // Print keys and values
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    }
	
	
	
	
	
	
	
	}
	
	
	

}
