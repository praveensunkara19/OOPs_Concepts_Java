package CLASS_3;

//*def:two or more interfaces can implementd in a class*/

interface interface1{
	public void method1();
	
}
interface interface2{
	public void method2();
}
 class class1 implements interface1,interface2 {
	public void method1() {
		System.out.println("method1 is implemented");
	}
	
	public void method2(){
		System.out.println("method2 is implemented ");	
}
 }
public class MultipleInterfaces {
	public static void main(String[] args) {
		class1 obj = new class1();
		obj.method1();
		obj.method2();
	}
}
