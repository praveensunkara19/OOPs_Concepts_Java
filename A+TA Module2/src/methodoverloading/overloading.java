package methodoverloading;

public class overloading {
	private static void display(int a) {
//		System.out.println("arguments: "+ a);
		System.out.println("arguments:integer ");
	}
	public static void display(String a) {
//		System.out.println("argumrnts: "+a+"and"+b);
		System.out.println("arguments: String ");
	}
	public static void main(String[] args) {
//		overloading obj = new overloading();
//		obj.display(0);
//		obj.display(5,10);
		display(1);
//		display(3,8);
		display("hello");
	}

}
