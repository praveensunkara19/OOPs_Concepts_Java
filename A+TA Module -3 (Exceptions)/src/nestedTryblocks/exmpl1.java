package nestedTryblocks;

public class exmpl1 {
	public static void main(String[] args) {
		try {
			//try prarent block
			try {
				System.out.println("going to divd by 30");
				int b = 30/0;
			}
			catch(Exception e) {
				System.out.println(e);
					
				}
			try {
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("other statements");
			}
		}
	catch(Exception e) {
		System.out.println("handeled exception outer c");
	}
System.out.println("normal flow");
}
}