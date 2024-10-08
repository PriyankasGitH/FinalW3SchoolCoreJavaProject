package testHashMap;
import java.util.HashMap;


public class StringtestHashmap {

	public static void main(String[] args) {
		
		 HashMap<String, String> capitalCities = new HashMap<String, String>();

		 // Add keys and values (Country, City)
		 capitalCities.put("England", "London");
		 capitalCities.put("Germany", "Berlin");
		 capitalCities.put("Norway", "Oslo");
		 capitalCities.put("USA", "Washington DC");
		 System.out.println(capitalCities);
		 
		 // Access an item
		 capitalCities.get("England");
		 
		 
		 // Remove an Item
		 capitalCities.remove("England");
		 
		 // Clear method
		 capitalCities.clear();
		 
		 // Size
		 capitalCities.size();
		 
		 
		 // Loop Through a HashMap
		 for (String i : capitalCities.keySet()) {
			  System.out.println(i);
			}
		 
		 for (String i : capitalCities.values()) {
			  System.out.println(i);
			}
		 
		 for (String i : capitalCities.keySet()) {
			  System.out.println("key: " + i + " value: " + capitalCities.get(i));
			}
		 
		
	}

}
