package exam;
abstract class A{
	abstract void firstmethod();

	void secondmethod() {
		System.out.println("sec meth");
	firstmethod();
	}	
}
abstract class B extends A{
//	@override
	void firstmethod()
	{
		System.out.println("fist meth");
		thirdmethod();
	}
	abstract void thirdmethod();
	
}
class C extends B{
	void thirdmethod() {
	System.out.println("third meth");
}
}
abstract class abstractcalss {
	public static void main(String[] args) {
		C c = new C();
		c.firstmethod();
		c.secondmethod();
		c.thirdmethod();
	}
}
