package oops;

public class RecursionTest {

	
	//Without halting condition : Use recursion to add all of the numbers up to 10.
	// Halting condition :  the halting condition is when the parameter k becomes 0.
	 public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }

	 
	 // With Halting condition
	 public static int sumWithHalt(int start, int end) {
		    if (end > start) {
		      return end + sumWithHalt(start, end - 1);
		    } else {
		      return end;
		    }
	 }
	 
	public static void main(String[] args) {
		
		// Recursive function without halt
		int result = sum(10);
	    System.out.println(result);
		
	   // Recursive function with halt
	    int result_wuth_halt = sumWithHalt(5, 10);
	    System.out.println(result_wuth_halt);
		
	}

}
