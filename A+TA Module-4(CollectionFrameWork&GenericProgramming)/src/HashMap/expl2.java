package HashMap;
import java.util.HashMap;

public class expl2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> numbers = new HashMap<>();
		
		System.out.println("initial map"+numbers);
		Boolean b =numbers.containsKey("app");
		
		System.out.println(b);
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		System.out.println("afert putting"+numbers);
	}

}
