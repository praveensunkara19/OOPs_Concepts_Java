package tryKeywords;

public class Example2 {
	
	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			 data = i/j;  //may throw an exception
		}
		catch(Exception e) { 
			//handle the exception
			System.out.println(i/(j+2));   //resolving the exception in catch block
		}
	}

}
