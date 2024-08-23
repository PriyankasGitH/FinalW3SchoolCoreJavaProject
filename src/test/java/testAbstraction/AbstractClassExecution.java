package testAbstraction;

import testAbstraction.StudentWithAbstract;
import testAbstraction.AbstractClassTest;


public class AbstractClassExecution {

	public static void main(String[] args) {
		
		StudentWithAbstract myObj = new StudentWithAbstract();

		 System.out.println("Name: " + myObj.fname);
		 System.out.println("Age: " + myObj.age);
		 System.out.println("Graduation Year: " + myObj.graduationYear);
		 myObj.study(); // call abstract method

	}

}
