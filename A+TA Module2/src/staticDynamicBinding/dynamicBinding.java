package staticDynamicBinding;


class  person1
{									
	public void speaks() 
	{
		System.out.println("person speaks");
	}
}
class teacher1 extends person1
{
	public void speaks()
	{
		System.out.println("teacher speaks");
	}
}

public class dynamicBinding {
	public static void main(String args[]) {
		person1 obj1 = new person1();
		person1 obj2 = new teacher1();
		obj1.speaks();					//dynamic or late binding
		obj2.speaks();
	}
}