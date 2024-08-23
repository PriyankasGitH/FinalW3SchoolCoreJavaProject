package core;

public class WhileTest {

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		
		// While loop
			int k = 0;
			while (k < 10) {
				  System.out.println(k);
				  k++;
				  if (k == 4) {
				    break;
				  }
			}
				
		// Continue loop
			int j = 0;
			while (j < 10) {
				  if (j == 4) {
				    j++;
				    continue;
				  }
				  System.out.println(j);
				  j++;
			}

		
	}

}
