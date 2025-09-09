package Assignment1;

class me {
	int regno;// = 2021998259;
	String name;// = "praveen";
	
	me(int regno,String name) {
		this.regno=regno;
		this.name=name;
		}
	void methodme() {
		System.out.println("student registration" + " " + regno +" and name" + " " + name);
		
	}
}

public class thisKeyWord{
	public static void main(String[] argc)
	{
		me obj = new me(2021998259,"praveen");
		obj.methodme();
	}
}