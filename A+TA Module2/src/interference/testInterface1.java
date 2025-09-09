package interference;
interface printable1{
	void print();
}
interface showable1{
	void show();
}
public class testInterface1 implements printable1,showable1 {
	public void print() {
		System.out.println("printed");
	}
	public void show() {
		System.out.println("showed");
	}
	public static void main(String args[]) {
		testInterface1 obj = new testInterface1();
		obj.print();
		obj.show();
	}

}
