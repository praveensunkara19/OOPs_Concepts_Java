package tryKeywords;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example4 {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\prave\\OneDrive\\Pictures\\Screenshots"); 	//ay throw an exception
			pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("saved successfully");
	}
	
}
