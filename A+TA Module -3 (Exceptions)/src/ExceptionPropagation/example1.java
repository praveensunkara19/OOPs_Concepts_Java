package ExceptionPropagation;

public class example1 {
	void m() {
		int d = 50/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		
		example1 obj = new example1();
		obj.p();
		System.out.println("normal flow");
	}
}
