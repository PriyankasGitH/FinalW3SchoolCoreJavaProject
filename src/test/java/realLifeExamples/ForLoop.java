package realLifeExamples;

public class ForLoop {

	public static void main(String[] args) {
		
		
		// Create a program that counts to 100 by tens:
		for (int i = 0; i <= 100; i += 10) {
			  System.out.println(i);
			} 
		
		
		// only print even values between 0 and 10
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
		
		
		// we create a program that prints the multiplication table for a specified number
		int number = 2;
		for (int i = 1; i <= 10; i++) {
			  System.out.println(number + " x " + i + " = " + (number * i));
			}
		
		
		

	}

}
