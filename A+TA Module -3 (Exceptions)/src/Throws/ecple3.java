package Throws;
import java.io.*;

class m{
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class ecple3 {
	public static void main(String[] args)  throws IOException{
		
			
			m obj = new m();
			obj.method();
		
		
		System.out.println("normal flow..");
	}
}
