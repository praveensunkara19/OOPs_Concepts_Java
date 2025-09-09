package nestedTryblocks;

//nested tryblock
public class practice2 {
	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]= 4;
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println(e3);
			System.out.println("index is invalid");
			try {
				String str = "praveen";
				int i = Integer.parseInt(str);
			}
			catch(NumberFormatException e2) {
				System.out.println(e2);
				System.out.println("Format mismatched");
				try {
					int d = 20/0;
				}
				catch(ArithmeticException e) {
					System.out.println(e);
					System.out.println("invalid division");
				}
			}
		}
		System.out.println("normal flow");
	}

}
