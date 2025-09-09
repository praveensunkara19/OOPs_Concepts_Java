package multipleCatchblocks;

public class multiplecatch {
	public static void main(String[] args) {
		try {
		int a[] = new int[5];
		a[10]=30;
		System.out.println(a[10]);
		
		}
	catch(ArithmeticException e){
		System.out.println("Arithmetic exception occured");
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

}
}