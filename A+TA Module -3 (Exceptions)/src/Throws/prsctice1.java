package Throws;
import java.io.IOException;
class class1{
	void method1() throws IOException{
		throw new IOException("exception is handled");
	}

}
public class prsctice1 {
	public static void main(String[] args) {
		try {
			class1 c = new class1();
			c.method1();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("exception is handleing");
		}
		System.out.println("normaol flow");
	}
}
