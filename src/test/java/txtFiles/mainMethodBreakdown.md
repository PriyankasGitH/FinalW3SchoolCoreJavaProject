## Main method breakdown
public static void main(String[] args) {
    // Method body
}


Keywords and Components:

	public:

		-- Access Modifier: The public keyword is an access modifier in Java.
		--Visibility: It specifies that the main method can be accessed from any other class or package. This is crucial because the Java Virtual Machine (JVM) needs to access the main method from outside the class when starting the application.

	static:

		-- Class-Level Method: The static keyword indicates that the main method belongs to the class, not to any instance of the class.
		-- No Object Required: It means you do not need to create an instance (object) of the class to call the main method. This is important because the JVM calls the main method to start the program before any objects are created.

	void:

		-- Return Type: The void keyword specifies that the main method does not return any value.
		-- No Return Value: This means the method performs its task (typically execution of the program) and does not provide any value back to the caller.

	main:

        -- Method Name: main is the name of the method.
		-- Entry Point: It is a special method name recognized by the JVM as the entry point of the Java application. The JVM looks for this method to start the execution of a Java program.

	String[] args:

		-- Parameter: This is a parameter to the main method.
		-- String[]: It denotes an array of String objects. 
		-- The args parameter is used to pass command-line arguments to the program.
		-- Command-Line Arguments: When you run a Java application, you can provide additional information or parameters from the command line, which are captured in this String array. For example, if you run java MyClass arg1 arg2, then args will be an array containing ["arg1", "arg2"].
		
