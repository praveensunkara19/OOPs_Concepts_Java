package methodoverriding;


class car {
	 void run() {
		System.out.println("the vehicle is running");
	}
}
class bike extends car{
		 void run() {
		System.out.println("the bike class inheritence with vehicle");
	}
	}

public class myclass{
	public static void main(String[] args)   //mainmethod
	{
		car obj1 = new car();		//If a class1 type reference refers
		obj1.run();					// to a class1 object, then class1's
        								// method is called
		
		car obj2 = new bike();		//if class1 type reference refers 
		obj2.run();					//to a class2 object,then class2 method is called
									//this is called run time polimorphisim
		
		
	}
}