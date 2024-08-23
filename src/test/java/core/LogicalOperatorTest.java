package core;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		
		// And operator
		int x = 5;
	    System.out.println(x > 3 && x < 10);
	    
	    // Or operator
	    System.out.println(x > 3 || x < 4);

	    // Not operator
	    System.out.println(!(x > 3 && x < 10));
	    
	}

}
