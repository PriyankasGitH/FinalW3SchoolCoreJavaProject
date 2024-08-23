package testEnums;

public class EnumTest {
	
	public enum Level {
		LOW,
		MEDIUM,
		HIGH

	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println("The selected level is: " + myVar);
		
		
		// For loop
		for (Level myVarLoop : Level.values()) {
			  System.out.println(myVarLoop);
			}
		
		// Switch case
		switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	}

}
