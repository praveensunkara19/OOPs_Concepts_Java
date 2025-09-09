package nestedTryblocks;

public class emplae2 {
	public static void main(String[] args) {
		
		try {
				String s= null;
				System.out.println(s.length());
			try {
					int i = 20/0;
					System.out.println(i);
					System.out.println("inner tryblock2");
				try { 
					int arr[] = {1,2,3,4};
					System.out.println(arr[10]);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("arithematic exception");
					System.out.println("inner tryblock1");
				}	
			}
			catch(ArithmeticException e) {
				System.out.println("arithematic exception");
				System.out.println("inner tryblock1");
		}
	}
		catch(Exception e4) {
			System.out.println(e4);
			System.out.println("outrmain try block3");
		}
		
			System.out.println("handled in main try-block");
		
}}
