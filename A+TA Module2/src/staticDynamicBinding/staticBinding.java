package staticDynamicBinding;

class person
{									//static/final/private are used in static binding 
	public static void speaks() 
	{
		System.out.println("person speaks");
	}
}
class teacher extends person
{
	public static void speaks()
	{
		System.out.println("teacher speaks");
	}
}
public class staticBinding {
public static void main(String args[]) {

	person obj1 = new person();
	person obj2 = new teacher();

	obj1.speaks();			//early binding or sratic binding because we calling the method from child class
	obj2.speaks();			//early binding or sratic binding because we calling the method from child class
							//but it wont execute untill obj,speak statm then,it referes to the parent class method.;
							//parent class method is cant be overrideed
}
}
