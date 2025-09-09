package Throws;
import java.io.IOException;

public class testclass1 {
	void m() throws IOException{
	throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		testclass1 obj = new testclass1();
		obj.p();
		System.out.println("normail flow...");
	}

}
