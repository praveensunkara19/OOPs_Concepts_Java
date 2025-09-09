package class1;

class class1{
	void method() {
		System.out.println("this is the method in class1");
	}
}
class class2 extends class1{
	void method() {
		System.out.println("method is overrided in class2");
	}
}
public class exp3 {
	public static void main(String[] args) {
		class1 obj = new class1();
		class1 obj1 = new class2();
		obj.method();
		obj1.method();
	}
}
