package core;

public class IfTest {
	
	
	public static void main(String[] args) {
	
		// If block
		
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}

		// If block
		
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		// If else
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		// Else if
		int time_to_greet = 22;
		if (time_to_greet < 10) {
		  System.out.println("Good morning.");
		} else if (time_to_greet < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		// Short hand if else
		
		// if..else
		int num_test = 20;
		if (num_test < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		// Short hand operator
		int time_short_hand = 20;
		String result = (time_short_hand < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		//
	
	
	
	
	
	
 }
}