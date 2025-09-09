package tryKeywords;

public class Example3 {
	public static void main(String[] args) {
		try {
			int data1 = 50/0;
		}
		catch(Exception e){
			int data2 = 50/0;	//generarting exception in catch block
		}
		System.out.println("rest of code");
	}

}
