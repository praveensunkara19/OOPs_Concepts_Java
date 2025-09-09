/**1) Write a Java Program to Check Whether the Character is Vowel or Consonant*/

package Assignment1;
import java.util.Scanner;


public class Characters {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the character");
	char ch = sc.next().charAt(0);

	if (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.println("the given characer is vowel"+ch);
	else
		System.out.println("the given character is consonant"+ch);
		
	
	
}
}
