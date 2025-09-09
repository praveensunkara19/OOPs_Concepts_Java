package practice;

public class Staticvoid { //class 
	
	public static void stvd() {  //metho
		System.out.println("thisis praveen"); //assigning variables to method
	}
	
	public void nonstvd() {
		System.out.println("this is non static void");
	}
	
	
public static void main(String[] args) { //main method
	stvd();
//	nonstvd(); //can;t executed coz this is non static
				//to execute this non static methods we should use the object
	Staticvoid sv = new Staticvoid();
	sv.nonstvd();
//	System.out.println(sv.nonstvd);
	
	
}
}
