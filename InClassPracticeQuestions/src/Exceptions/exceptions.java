package Exceptions;

public class exceptions {
	public static void main(String[] args) {
		try {

			int d1 = 50/0;
			
			int a[] = new int[5];
			System.out.println(a[15]);
			
			String s1 = "praveen sunkara";
			int index1 = s1.indexOf("sunkara");
			System.out.println(index1);
			
//			String s2 = "45";
//			System.out.println(s2);
//			
		}
		
		catch(ArithmeticException e) {
			System.out.println("invalid division");
		}

	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("arrey index is invalid");
	}
		
		catch(Exception e) {
			System.out.println("Format mismatched");
		}
		
	}
}
