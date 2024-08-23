package oops;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		    Scanner myObj = new Scanner(System.in);
		    System.out.println("Enter username");

		    String userName = myObj.nextLine();
		    System.out.println("Username is: " + userName);
		    
		    Scanner myObjAll = new Scanner(System.in);
		    System.out.println("Enter name, age and salary:");
		    // String input
		    String name = myObjAll.nextLine();

		    // Numerical input
		    int age = myObjAll.nextInt();
		    double salary = myObjAll.nextDouble();
		    
		    // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
		    

	}

}
