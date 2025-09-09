package Class4;

class UDE extends Exception{
	public UDE(String str) {
		super(str);			//userdefinrdException is created 
	}
}
public class predefinedExceptions {
	public static void main(String[] args) {
		try {
			throw new UDE("this is user defined exception"); //throws an exception 
		}
		catch(UDE e) {			//catchingg the exception using the userdefinedException 
			System.out.println("userdefined exception:"+e);
			System.out.println("userdefined exception:"+e.getMessage());
							//here we can get the message given
		}
	}
}
