package HashMap;
import java.util.HashMap;
public class expl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> lang = new HashMap<> ();
		lang.put(1,"python");
		lang.put(2,"javva");
		lang.put(3,"c++");
		
		System.out.println("created map"+lang);
		
		String i = lang.remove(1);
		System.out.println("removed index element:"+i);
		String ii = lang.replace(1,"rasberry");
		System.out.println(lang);
		
		System.out.println(lang.containsKey("c++"));
		
	}

}
