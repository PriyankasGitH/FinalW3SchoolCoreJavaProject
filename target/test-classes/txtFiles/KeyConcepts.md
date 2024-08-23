# -- Java Key Concepts

#####Points to remember

	-- It's case sensitive
	
	-- Saving the file should have same name as class name followed by .java extention
	
	-- You should also note that each code statement must end with a semicolon (;).

#####write main syntax

	-- Execution begins here
	
	-- Only one method can be present

#####To write a class name

        -- Everything should be in a class in java
		
		-- Class name where : 
		
		    -- class is a keyword
		    
		    -- name should start with a capital letter
		    
		-- Prefix with an access modifier
		
		
#####To write a method name

		
		-- Method name starts with a lower case
		
		-- Prefix with a return type followed by access modifier
		
#####{}
		
		-- Beginning & end of the curly braces
		
#####println()
	
		-- It's built in method to print text to the console
		
		
#####System.out.println()
	
		-- System : 
		
		   -- System is a utility class provided by Java with several static members.
		
		   -- System is a built-in class in the java.lang package. 
		   
		   -- It provides several useful class fields and methods, including standard input, output, and error streams.
		   
		   
	
	   -- Out :
	   
	   	  -- out is a static field in the System class
              -- It is an instance of PrintStream, which is a class responsible for outputting data to the console or other output streams.
              -- System.out refers to the standard output stream, which is typically the console (terminal).
              -- System.out is a PrintStream object that is used for standard output operations.
          
          
 

       -- println():
       
       	-- println() is a method of the PrintStream class, not the System class directly.
            -- This method is used to print data to the console with a newline at the end.
          
## Data Types

#####Basic Data types : 4 primitive & 1 non-primitive : objects

		-- String -> Text -> Double quotes -> "Hi"
		
		-- Char --> Single character --> Single quotes -> 'p'
		
		-- int --> Whole / Non decimal numbers -> 0
		
		-- float --> decimal numbers --> 1.2f
		
		-- double --> decimal numbers --> 1.2d
		
		-- boolean --> 2 states --> true / false
		
#####Advanced Data types

1. Primitive Data types

   byte -> short -> int -> long -> float -> double -> boolean -> char
 
2. Non-Primitive Data types

   String ( exception as built in ) -> Arrays -> Classes -> Interfaces
   
   
   creation -> methods -> values -> uppercase

##String Type

   - Ninth Type
   - A String in Java is actually a non-primitive data type, because it refers to an object. 
   - The String object has methods that are used to perform certain operations on strings. 
  
##Static Method : with & without parameter

- __myMethod()__ : is the name of the method
- __static__ : means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
- __void__ :  means that this method does not have a return value. You will learn more about return values later in this chapter

##Method : Parameters & Arguments

##### Parameters 

-	Information can be passed to methods as a parameter. Parameters act as variables inside the method.

-  Parameters are specified after the method name, inside the parentheses. 

- You can add as many parameters as you want, just separate them with a comma.	
		
##### Arguments 		
		
- When a parameter is passed to the method, it is called an argument. 

- when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.		

##### Return type

- 	If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:


##Method : Variable Scope

- Variables are only accessible inside the region they are created. This is called scope.

##### Method scope

- Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

##### Block scope

- A block of code refers to all of the code between curly braces {}.

- A block of code may exist on its own or it can belong to an if, while or for statement. 

- In the case of for statements, variables declared in the statement itself are also available inside the block's scope.


##Method :Recursive Method

- Recursion is the technique of making a function call itself. 

- This technique provides a way to break complicated problems down into simple problems which are easier to solve.

##### Halting condition

- Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. 

- Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
 
##### Loop termination 
 
 - The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power. 
 
 - However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.
 
 
##Method : Oops

Object-oriented programming has several advantages over procedural programming:

- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time
- Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

##### Static & public

- static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects



##### Classes & objects

- a class is a template for objects, and an object is an instance of a class.

- When the individual objects are created, they inherit all the variables and methods from the class.

- e.g. Class : Fruit & Objects : Apple, Mango & Banana  

- The car has attributes, such as weight and color, and methods, such as drive and brake.

- A Class is a "blueprint" for creating objects.

- Another term for class attributes is fields.

- Modify attributes

- The dot (.) is used to access the object's attributes and methods.

- A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

- A class can have a single or multiple constructors. 
   We can set initial values with constructor parameters
   We can set a single default value and take other values as dynamic values
   We can set a multiple default value and take other values as dynamic values
   
   
- The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

     - declare class variables/attributes as private
     - provide public get and set methods to access and update the value of a private variable  
     - Better control of class attributes and methods
     - Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
     - Flexible: the programmer can change one part of the code without affecting other parts
     - Increased security of data 
     - The get method returns the variable value, and the set method sets the value.
     - Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
     - The this keyword is used to refer to the current object.
     
 - Inheritance
 
    - subclass (child) - the class that inherits from another class
    - superclass (parent) - the class being inherited from
    - protected keyword in parent class
    - final keyword
    
 - Polymorphism
   
    - Inheritance lets us inherit attributes and methods from another class.
    - Polymorphism uses those methods to perform different tasks.
    - This allows us to perform a single action in different ways.  

##Method : Variable Final keyword

- The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

- The final keyword is called a "modifier"


##Inner class

- The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

- To access the inner class, create an object of the outer class, and then create an object of the inner class:

##Interfaces

- Notes on Interfaces:
- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)
- Why And When To Use Interfaces?

-   1) To achieve security - hide certain details and only show the important details of an object (interface).

-   2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

##Interfaces

- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:


## Enum

- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters

- Enum is short for "enumerations", which means "specifically listed".

##### Difference between Enums and Classes

- An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

- An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

##### Why And When To Use Enums?

- Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

##### Array List


## Array List

- The ArrayList class is a resizable array, which can be found in the java.util package.

- The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 

- While elements can be added and removed from an ArrayList

- Array List contains objects

--  To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:



#ArrayList vs. LinkedList

- The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

- The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

- However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

#####How the ArrayList works
- The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. 

- If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

#####How the LinkedList works
- The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. 

- To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

- Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.


#HashMap
- In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). 

- A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

- One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values


#HashSet
- A HashSet is a collection of items where every item is unique, and it is found in the java.util packageA HashSet is a collection of items where every item is unique, and it is found in the java.util package


#Iterator
- An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

- To use an Iterator, you must import it from the java.util package.


#Wrappper class

- Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

- ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid

- ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid


#Try Catch Exception

- When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

- When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error)

- The try statement allows you to define a block of code to be tested for errors while it is being executed.

- The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

- The finally statement lets you execute code, after try...catch, regardless of the result


#Regular Expression

- A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

- A regular expression can be a single character, or a more complicated pattern.

- Regular expressions can be used to perform all types of text search and text replace operations.

- Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

- Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

#Thread

- Threads allows a program to operate more efficiently by doing multiple things at the same time.

- Threads can be used to perform complicated tasks in the background without interrupting the main program.
