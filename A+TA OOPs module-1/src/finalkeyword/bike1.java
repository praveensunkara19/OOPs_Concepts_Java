package finalkeyword;

public class bike1 {
	final void run() {
		System.out.println("first method to run bike");	
	}
	class car extends bike1{
		void run() {
			System.out.println("the method to run the car");
		}
	}
	public static void main(String[] args) {
		car obj = new car();
		obj.run();
	}

}
