package practice;

public class student {
	int x=5;

	public static void main(String[] args) 
	{
		student obj = new student();
		student obj2 = new student();
		obj2.x=25;
		System.out.println(obj.x);
		System.out.println(obj2.x);
	}
}
