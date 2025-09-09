package collectionFramework;

import java.util.ArrayList;

public class exp3 {
	public static void main(String[] args) {
		ArrayList<String>  animals = new ArrayList<>();
		animals.add("cow");
		animals.add("tiger");
		animals.add("liger");
		animals.get(2);
		animals.indexOf("liger");
		
		animals.remove("cow");
		System.out.println("animal list="+animals);
	
		
	}

}
