package module_2;

import java.util.Scanner;

public class RevString {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String []args) {
		//we have to print the character in the array
		System.out.println("enter the world:");
		String name = sc.nextLine();
		char rev[] = name.toCharArray();
		for(int i=rev.length-1;i>=0;i--) {
		System.out.print(rev[i]);
	}
		System.out.print(" ");
}
}
