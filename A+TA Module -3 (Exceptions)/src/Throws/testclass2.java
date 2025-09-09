package Throws;
import java.io.*;

class testclass {
	public static void method() throws IOException{
		throw new IOException("device public class testthrows2"); 
	}}
	public class testclass2{
	public static void main(String args []) {
		try {
			testclass obj = new testclass();
			obj.method();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("normal flow..");
	}
}
