package CLASS_3;

//public,private,[protected],default
//*each interface should extended by derives interface and implemeted with class*/

interface Aa{
	public void method1();	//private,protected access specifiers cant be use in interfaces.
}
interface Bb extends Aa{
	void method2();
}
interface Cc extends Bb{
	public void method3();
}
class clasico implements Cc{
	public void method1(){
		System.out.println("this is method Aa");
	}
	 public void method2() {
		System.out.println("this is method B");
	}
	 public void method3() {
		 System.out.println("this is method C");
	 }
}
public class multiLevelInterfaces {
	public static void main(String args[]) {
		clasico obj = new clasico();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
