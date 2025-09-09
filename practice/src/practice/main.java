package practice;

public class main { //main calss
	static void mycar(int maxspeed)
	{
			System.out.println("i brought new max speed"+ maxspeed);
		}
	
	static void mymethod()
	{
		System.out.println("welcome to vitap");
	}
	public static void main(String[] args) 
	{
		main obj = new main();
		obj.mymethod();
		mycar(200);
	}
}
