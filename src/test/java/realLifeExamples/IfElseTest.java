package realLifeExamples;

public class IfElseTest {

	public static void main(String[] args) {
		
		// if..else to "open a door" i
		int doorCode = 1337;

		if (doorCode == 1337) {
		  System.out.println("Correct code. The door is now open.");
		} else {
		  System.out.println("Wrong code. The door remains closed.");
		}
		
		
		// if..else to find out if a number is positive or negative:
		int myNum = 10; // Is this a positive or negative number?

		if (myNum > 0) {
		  System.out.println("The value is a positive number.");
		} else if (myNum < 0) {
		  System.out.println("The value is a negative number.");
		} else {
		  System.out.println("The value is 0.");
		}
		
		// Find out if a number is even or odd:
		int myNumEvenOdd = 5;

		if (myNumEvenOdd % 2 == 0) {
		  System.out.println(myNumEvenOdd + " is even");
		} else {
		  System.out.println(myNumEvenOdd + " is odd");
		} 
		
		
		

	}

}
