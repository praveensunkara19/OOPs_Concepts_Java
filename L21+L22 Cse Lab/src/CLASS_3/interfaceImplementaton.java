package CLASS_3;

interface A {
	public void method1();
}

class Class2 implements A{
	 public void method1() {			//only we can implement the method which in the interfacce 
									//with the public specifer
		System.out.println("implemented the method1 in class1");
	}
}
	class Class3 extends Class2{
		public void method1() {
			System.out.println("method1 is overrided in the class3");
		}
	}
	
	public class interfaceImplementaton{
		public static void main(String[] args) {
			Class2 obj1 = new Class2();
			obj1.method1();
			
			Class2 obj2 = new Class3();
			obj2.method1();
			
		}
	}
	
