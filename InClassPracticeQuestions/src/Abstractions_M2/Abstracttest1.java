package Abstractions_M2;

abstract class calculation{
	abstract void add();
	
	void subtract() {
		System.out.println("method sub");
	}
	abstract void multiplication();
	
	void division() {
		System.out.println("method div");
	}
}
	class abstractdemo extends calculation{
		public void add() {
			System.out.println("method add implemented in childclass");
		}
		public void multiplication() {
			System.out.println("method multiplication implemented in childclass");
		}
	}

public class Abstracttest1 {
	public static void main(String[] args) {
	abstractdemo obj = new abstractdemo();
	obj.subtract();
	obj.division();
	obj.add();
	obj.multiplication();

	}
}
