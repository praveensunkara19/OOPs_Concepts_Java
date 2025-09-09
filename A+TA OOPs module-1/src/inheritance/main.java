package inheritance;

class class1 {
	void method() {
		System.out.println("superclass/parentclass");
		
	}
}
class class2 extends class1 {
	void method() {
		System.out.println("subclass/childclass");
	}
}
public class main {
	public static void main(String args[]) {
		
	
	class1 obj1 = new class1();
	class2 obj2 = new class2();
	class1 obj3 = new class2();			// when methods names are same(class1 type reference refers to the 
										//class2 objects, then method of class2 will be called.
//		obj2.method();
		obj1.method();	
		obj3.method();
}
}
