//paramerized constructe

package Constructor;


//paramerized constructe

public class MainMethod
{
	int x;
	public MainMethod(int y)		//Parameterized constructor
	{
		x=y;
	}
	public static void main() 
	{
		MainMethod myobj = new MainMethod(50);
		System.out.println(myobj.x);
	}
	
}

