package methodoverloading;

public class methodoverloading {		//multiple methods with same method name methodoverloading is used
	
		public int sum(int x, int y)	//methods with diferent parameters/arguments and differemt data types
		{
			return(x+y);
			
		}
	public int sum(int x,int y,int z)
	{
		return(x+y+z);
		
	}
	public double sum(double x,double y)		//double is a data type
	{
		return(x+y);
		
	}
	public static void main(String[] args) {
		methodoverloading s = new methodoverloading();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(15,40,40));
		System.out.println(s.sum(40.5,60));

	}
	}


