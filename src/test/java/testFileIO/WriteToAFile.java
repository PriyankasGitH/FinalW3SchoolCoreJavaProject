package testFileIO;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class WriteToAFile {

	public static void main(String[] args) {
		
		  try {
		      FileWriter myWriter = new FileWriter("/Users/priyanka/eclipse-workspace/W3SchoolJava/src/test/java/testFileIO/filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		

	}

}
