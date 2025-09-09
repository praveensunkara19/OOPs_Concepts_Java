package interference;

interface drawable{
	 void draw();
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("printing the rectangle");
	}
}
class square extends rectangle{
	public void draw() {
		System.out.println("printing the square");
	}
}

public class testInterface {
	public static void main(String args[]) {
	rectangle obj1 = new rectangle();
	obj1.draw();
	
	square obj2 = new square();
	obj2.draw();
	
}}
