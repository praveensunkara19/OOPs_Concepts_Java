package javaVectord;

import java.util.Vector;
import java.util.ArrayList;

public class vectors {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("pig");
		obj.add("puppy");
		obj.add("buffelo");
		obj.add("cat");
		System.out.println(obj);
		
		Vector<String> obj1 = new Vector<>();
		obj1.add("cow");
		obj1.addAll(obj);
		System.out.println(obj1);
	}

}
