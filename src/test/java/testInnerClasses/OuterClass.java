package testInnerClasses;

public class OuterClass {
	 int x = 0;
	
	
	class InnerClass {
	    int y = 5;
	    public int myInnerMethod() {
	        return y;
	      }
	  }
	
	 private class InnerClass1 {
		    int z = 5;
		  
	 }
	 
	 protected class InnerClass2 {
		    int w = 0;
		  
	 }
	 

	static class InnerClass3 {
	    int b = 5;
	  }
	
	
	public static void main(String[] args) {
		
		// inner class 
		OuterClass myOuter = new OuterClass();
		 OuterClass.InnerClass myInner = myOuter.new InnerClass();
		 System.out.println(myInner.myInnerMethod());
		 
		 // static method
		 OuterClass.InnerClass3 myInnertwo = new OuterClass.InnerClass3();
		 System.out.println(myInnertwo.b);
		
		// Acceessing outer class via inner class
	}

}
