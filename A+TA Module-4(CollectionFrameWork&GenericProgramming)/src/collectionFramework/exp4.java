package collectionFramework;
//we have to import the java.util package to acces the ArrayList,vectorsLinkedList ect classes

import java.util.*;
public class exp4 {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<>();
		obj.add("app");
		obj.add("cypto");
		obj.add("douch");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.iterator());
//		System.out.println(obj.removeAll(obj));
//		System.out.println(obj.clear());
		
		
		System.out.println(obj.add("hello"));
		System.out.println(obj);
		
		obj.remove("app");
		System.out.println(obj);
		obj.set(2, "pine");
		System.out.println(obj);
		
		boolean str = obj.contains("app");
		System.out.println(str);
		
//		Object[] st = obj.toArray();
//		System.out.println(st);
	}

}
