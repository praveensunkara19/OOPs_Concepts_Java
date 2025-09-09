package finalkeyword;

public class bike {
	 int speedlimit = 150;
	
	void run() {
		speedlimit = 200;
	}
public static void main(String[] args) {
	bike obj = new bike();
	System.out.println(speedlimit);
	obj.run();
}
}
