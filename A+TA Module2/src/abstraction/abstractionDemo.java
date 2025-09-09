package abstraction;


abstract class baseclass{
	abstract void show1(); // abtract method end with semi column won't present method body
	
	public void show2()
	{
		System.out.println("concrete method");
	}
	}
	class childclass extends baseclass
	{
		public void show1() {							//here in another class abstrated method show1 is implemented
			System.out.println("implemented method show");
		}
		public void show2() {
			System.out.println("overrideing the show2 method");
		}
}

public class abstractionDemo {
	public static void main(String[] args) {
	childclass obj = new childclass();
//		baseclass obj1 = new baseclass(); //we can't create a objects for the abstract method
									
	obj.show1();
	obj.show2();

	}

}
