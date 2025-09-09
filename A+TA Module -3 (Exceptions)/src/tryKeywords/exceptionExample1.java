package tryKeywords;

public class exceptionExample1 {
	public static void main(String args[]){  
		try {
		int data = 50/0;	// error is occured
		}
			catch(ArithmeticException  e) { //class reference
				System.out.println(e);
				System.out.println("rest of the code");
				System.out.println("Can't divide  by zero");
				//we can display costum messages
		}
	}
	}
