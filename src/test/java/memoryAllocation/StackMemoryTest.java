package memoryAllocation;

public class StackMemoryTest {

	public static void main(String[] args) {
		
		/*
		 * **1. Stack Memory
			
				Purpose: 
				
					-- Used for storing local variables, method parameters, and method call information.
					
        		    -- Scope: Memory is allocated and deallocated automatically when methods are called and return.
        
        		Characteristics:
        		
        			-- Fast Access: Because of its Last In, First Out (LIFO) nature, accessing data from the stack is very fast.
        			
        			-- Limited Size: The stack has a limited size, which can lead to StackOverflowError if too many method calls are made (deep recursion).
		
		 * 
		 * */
		
		        int localVariable = 10; // Stored in stack
		        
		 /*
		  * 
		  *     
		  *     **2. Heap Memory

				   		-- Purpose: Used for storing objects and their instance variables. It is also used for garbage collection.

				   		-- Scope: Objects created in heap memory have a longer life cycle and persist until they are no longer referenced.


					Characteristics:


					    -- Dynamic Allocation: Memory is allocated dynamically at runtime using the new keyword.

						-- Garbage Collection: Java's garbage collector automatically reclaims memory used by objects that are no longer reachable.

						-- Flexible Size: Generally larger than stack memory, but can still be constrained by the JVM's configuration.
		    
		  *     
		  */
		        /*
		           class MyClass {
		        	int value;
		    			}
		          
		          
		          // Main method
		          
		          MyClass obj = new MyClass(); // 'obj' is stored in heap memory
		          
		        */
		        	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
