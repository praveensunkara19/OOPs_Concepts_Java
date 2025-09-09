package collectionFramework;

import java.util.*;

public class exp5 {
	public static void main(String[] args) {
		
		ArrayList <Integer> num = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integers:");
		for(int i=0;i<3;i++ ) {
			int str = sc.nextInt();
			num.add(str);
		}
		System.out.println(num);
	}
}
