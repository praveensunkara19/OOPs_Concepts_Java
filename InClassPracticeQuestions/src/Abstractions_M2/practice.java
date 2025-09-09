package Abstractions_M2;
interface A{
	public void a();
	public void b();
	public void  c();
	public void  d();
}
 class B implements  A{		//if we remove that abstract word,then we get the result  
	public void c() {
		System.out.println("method c");
	}
	 abstract class M {
		public void a() {
			System.out.println("method a");
		}
		public void b() {
			System.out.println("method b");
		}
		public void d() {
			System.out.println("method d");
		}}
	void display() {
		M obj = new M();
			obj.a();
			obj.b();
			obj.d();	
	}}
class practice{
	public static void main(String[] args) {
		 B obj = new B();
		 obj.c();
		 obj.display();
		}}

