package collectionFramework;
import java.util.*;
public class liskedList {
	public static void main(String[] args) {
		LinkedList <String> obj = new LinkedList<>();
		obj.add("app");
		obj.add("apple");
		obj.add("applicatio");
		obj.add("java");
		System.out.println("LinkedList"+obj);
		
		System.out.println(obj.set(2, "python"));
		System.out.println(obj.set(3, "c++"));
		
		
		
		System.out.println(obj.get(3));
		System.out.println("updatedList"+obj);
		
		System.out.println(obj.remove(1));
		
		System.out.println("updatedList"+obj);
		
	}

}
