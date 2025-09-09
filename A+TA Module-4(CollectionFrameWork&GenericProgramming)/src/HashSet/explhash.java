package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class explhash {
	public static void main(String[ ] args) {
		HashSet<Integer> obj = new HashSet<>();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		System.out.println("hashset"+obj);
		
		HashSet<Integer> obj1 = new HashSet<>();
		obj1.addAll(obj);
		obj1.add(12);

		System.out.println("new hashset"+obj1);
		
		Iterator<Integer> iterate = obj.iterator();
		System.out.println("hashset using iterator");
//		System.out.println(obj);
		
		while(iterate.hasNext()) {
		System.out.println(iterate.next());
		System.out.println(",");
		}
	}
}
