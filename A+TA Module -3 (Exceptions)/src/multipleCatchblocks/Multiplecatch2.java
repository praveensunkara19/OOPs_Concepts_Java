package multipleCatchblocks;

public class Multiplecatch2 {
	public static void main(String[] args) {
	try {
		String s = null;
		
//		int a[] = new int[5];
		System.out.println(s.length());
		
//		System.out.println(a[10]);
	}
	catch(ArithmeticException e) {
		System.out.println("arithmetic exception");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Arreyindexoutofbound");
	}
	catch(Exception e) {
		System.out.println("parent exception occured");
	}
	System.out.println("rest of code");
}}