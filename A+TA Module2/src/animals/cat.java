package animals;

public class cat implements Animal {
	public void eat() {
		System.out.println("cat drinks milk");
	}
	public void travel() {
		System.out.println("cat travel silently");
	}
	void sleep() {
		System.out.println("cat sleeps more time");
	}
public static void main(String[] args) {
	cat obj = new cat();
	obj.eat();
	obj.travel();
	obj.sleep();
}
}
