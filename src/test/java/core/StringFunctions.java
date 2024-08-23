package core;

public class StringFunctions {
	
	
	public static void main(String[] args) {
		String txt= "Hello World";
		
		// Checking the length
		System.out.println("The length of the txt string is: " + txt.length());
		
		
		// Converting to upper case
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		
		
		// Converting to lower case
		System.out.println(txt.toLowerCase()); 
		
		// Finding a character
		String txtFind = "Please locate where 'locate' occurs!";
		System.out.println(txtFind.indexOf("locate")); // Outputs 7
		
		// Concatination icon
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		// Concatination function
		String givenName = "John ";
		String surName = "Doe";
		System.out.println(givenName.concat(surName));
		
		// Double quotes
		String doubleQuote = "We are the so-called \"Vikings\" from the north.";
		System.out.println(doubleQuote);
		
		// Single quotes
		String singleQuote = "It\'s alright.";
		System.out.println(singleQuote);
		
		// Backslash
		String singlBackslash = "It\'s alright.";
		System.out.println(singlBackslash);
		
		
		
		
		
		

 }
	
}