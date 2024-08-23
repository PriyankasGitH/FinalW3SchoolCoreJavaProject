package testWrapper;

public class CreatingWrapperObjects {

	public static void main(String[] args) {
		
		
		    Integer myInt = 5;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
		    
		    // get the value associated with the corresponding wrapper object:
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
		    // toString() method, which is used to convert wrapper objects to strings.
		    
		    Integer myIntNum = 100;
		    String myString = myIntNum.toString();
		    System.out.println(myString.length());

	}

}
