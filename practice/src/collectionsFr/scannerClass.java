package collectionsFr;

import java.util.ArrayList;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj = new ArrayList<> ();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String values:");
		for (int i=0;i<3;i++) {
			String str = sc.nextLine();
			obj.add(str);
			
		}
		System.out.println(obj.add("php"));
		System.out.println(obj);
		
	}

}
