package HashMap;
import java.util.HashMap;

public class exp1 {

	public static void main(String[] args) {

		HashMap<String,Integer> obj = new HashMap<>();
		obj.put("one",1);
		obj.put("two",2);
		obj.put("three",3);
		System.out.println("created list:"+obj);
		System.out.println("keys:"+obj.keySet());
		System.out.println("values:"+obj.values());
		
		System.out.println("entries:"+obj.entrySet());
		
		obj.remove("two");
		System.out.println(" after removed:"+obj);	
	}
}
