package HashSet;

import java.util.HashSet;

public class hashexpl2 {
	public static void main(String [] args) {
	HashSet<Integer> obj = new HashSet<>();
	obj.add(4);
	obj.add(1);
	obj.add(7);
	obj.add(8);
	System.out.println("hasset"+obj);
	
	HashSet<Integer> number = new HashSet<>();
	number.add(8);
	number.add(0);
	number.add(4);
	
	
	System.out.println("hashSet"+number);
	
	number.addAll(obj);
	System.out.println("union"+number);
	
	number.retainAll(obj);
	System.out.println("intersection is:"+number);
}
}