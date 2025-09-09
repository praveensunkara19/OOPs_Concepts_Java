package assignment_2;

import java.util.Scanner;
public class Qsn_4 {
	public static void main(String[] args) {
		System.out.println("enter the word:");
		Scanner sc = new Scanner(System.in);
		
		char word[] = sc.nextLine().toCharArray();
		System.out.println("reversed word is:");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]);
		}
			}

}
