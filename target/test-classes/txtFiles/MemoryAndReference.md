# Memory And Reference

# Memeory



# Reference

   - In Java, the terms reference and non-reference (or primitive) types refer to different ways of managing and using data.
   
   
   
   - Reference Types
Reference types are used to refer to objects and data structures that are stored in the heap memory. 



  - When you create an object in Java, you are working with reference types. These types hold references (or addresses) to the actual objects in memory rather than the data itself.
  

###Characteristics of Reference Types:
  

  - Memory Allocation: Objects are allocated in the heap memory, and the reference (or pointer) to the object is stored in the stack.


- Default Values: The default value of a reference type is null, indicating that the reference does not point to any object.


- Behavior: Reference types can be null, and you can use them to access or modify the object they point to. 


###Characteristics of Non-Reference (Primitive) Types


- Primitive types are the basic data types that hold their values directly in memory. 


- They are not objects and do not have methods. Primitive types are managed in stack memory and are more efficient for certain operations.

###Characteristics of Non-Reference Types:

- Memory Allocation: Primitive values are stored directly in stack memory.


- Default Values: Each primitive type has a default value:
int: 0
boolean: false
char: '\u0000'
float: 0.0f
double: 0.0d
byte: 0
short: 0
long: 0L


- Behavior: Primitive types cannot be null and do not support methods.


###Summary

#####Reference Types:

- Definition: Types that refer to objects and data structures.
- Examples: Classes, interfaces, arrays, enumerations.
- Memory: Stored in the heap; references are stored in the stack.
- Default Value: null.


#####Primitive Types:

- Definition: Basic data types that store values directly.
- Examples: int, boolean, char, float, double, byte, short, long.
- Memory: Stored directly in the stack.
- Default Values: Defined values like 0, false, '\u0000'.