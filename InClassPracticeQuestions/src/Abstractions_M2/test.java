package Abstractions_M2;
interface drawable{
	void draw();
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class test {
	public static void main(String[] args) {
		rectangle obj1 = new rectangle();
		circle obj2 = new circle();
		obj1.draw();
		obj2.draw();
		
	}
}
