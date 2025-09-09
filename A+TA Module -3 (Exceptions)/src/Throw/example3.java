package Throw;

 class UserDefinedException extends Exception{			//here we created our own exception
	public  UserDefinedException(String str) {			//this the constuctor
		super(str);
		
	}
}
public class example3 {
	public static void main(String [] args) {
		try {
			throw new  UserDefinedException("this is user define");//passinfg customized message
		}
		catch(UserDefinedException ude){
			System.out.println("catch the exception");
			System.out.println(ude.getMessage());
			System.out.println(ude);
		}
	}
}
