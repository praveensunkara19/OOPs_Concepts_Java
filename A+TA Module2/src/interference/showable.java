package interference;

interface printable {
	void print();

}
class showable implements printable{
	public void print() {
		System.out.println("hellow");
	}

public static void  main(String[] args) {
	showable obj = new showable();
	obj.print();
}
}