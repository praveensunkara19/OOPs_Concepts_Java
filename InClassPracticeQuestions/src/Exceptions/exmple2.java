package Exceptions;

public class exmple2 {
	public static void main(String[] args) {
		try {
			int a[] = new  int[3];
			a[3]= 2;
			try {
				String str = "praveen sunkara";
				int i = Integer.parseInt(str);
			
				try {
					int d = 50/0;
				}
				catch(ArithmeticException e1) {
					System.out.println(e1);
					System.out.println("invalid division");
				}
			}
			catch(NumberFormatException e2) {
				System.out.println(e2);
				System.out.println("format mismatched ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("index is invalid ");
		}
		System.out.println("normal flow");
	}}
