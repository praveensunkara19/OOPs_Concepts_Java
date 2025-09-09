package interference;

interface printable2{
	void print();
}											
interface showable2 extends printable2{
	void show();
}
public class testInterface2 implements printable2,showable2 {
	public void print() {										//here we are implementing the abstact method 
		System.out.println("printing");		
	}
	public void show() {
		System.out.println("showing");
	}
	public static void main(String args[]){
		testInterface2 obj = new testInterface2();	
		obj.print();
		obj.show();
	}

}
