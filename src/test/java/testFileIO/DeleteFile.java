package testFileIO;
import java.io.File;  // Import the File class

public class DeleteFile {

	public static void main(String[] args) {
		
		    File myObj = new File("/Users/priyanka/eclipse-workspace/W3SchoolJava/src/test/java/testFileIO/DeleteFile.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		

	}

}
