package abstraction;

interface printable{		//interface
	void print();			//abstraction
	}

interface showable{
	void show();
}

class test implements printable,showable
{
	public void print() 
	{
		System.out.println("hello");
	}
	public void show() 
	{
	System.out.println("welcome");
	}
	public static void main(String args[]) {
		test obj = new test ();
		obj.print();
		obj.show();
	}
}
