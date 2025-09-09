package Palindrome;
import java.util.Scanner;

public class Palindrome {		//class
	
	public static void main(String[] args) 
	{		 //main method
		int r,s = 0,temp;
		int x ; //
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		x=sc.nextInt();
		temp = x;
		while (x>0)
		{
			r=x%10;  //find it's remainder 
			s=(s*10)+r;  //storing it to new variable s
			x=x/10;    	//again we wil take that numbers quotient
			
			//this while loop divide that number untill its 0
		}
		if (temp==s)
			System.out.println("the given number is palindrome");
		else
			System.out.println("the given number is not a palindrome");
	}
}
