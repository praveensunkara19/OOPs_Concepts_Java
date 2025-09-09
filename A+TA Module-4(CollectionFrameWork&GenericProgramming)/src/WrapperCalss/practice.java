package WrapperCalss;

//generic programming appling to arraylist..
import java.util.*;

class trail{
	public  <T> void construct(T data){
		System.out.println("data:"+data);
	}
}
//class second{
//	public static <F> void method1(F[] elements){		//used for the arrays
//		for(F element:elements) {
//			System.out.println(element);
//		}
//	}

public class practice {

	public static void main(String[] args) {
		trail obj = new trail();
		obj.<Integer>construct(47);
		obj.<String>construct("hi");
		
		ArrayList<String> obj1 = new ArrayList<>();
		obj1.add("java");
		obj1.add("python");
		obj1.add("c++");
	
		System.out.println("ArrayList:"+obj1);
		
		method1(obj1);
		
	}

	private static void method1(ArrayList<String> obj1) {
		// TODO Auto-generated method stub
		
	}
}
