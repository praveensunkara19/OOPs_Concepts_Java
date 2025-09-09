package Throw;


public class example1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible for vote");
		}
		else {
			System.out.println("eligible for vote");
		}
	}
	public static void main(String[] args) {
		validate(18);
		validate(14);
	System.out.println("normal flow ");
}
}
