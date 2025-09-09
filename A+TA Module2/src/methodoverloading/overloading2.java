/** method overloading is not possible by changing the return type - static */
package methodoverloading;

class adder{
	static int add(int a,int b) {
		return(a+b);
	}
	static double add(int a,int b) {
		return(a+b);
	}
}
class overloading2{
	public static void main(String args[]) {
		adder obj = new adder();
		System.out.println(obj.add(11,11));		//ambiguity
	}
	
}
//result : dublicate method have same add(int,int) ambiguity