package Assignment1;

import java.util.Scanner;

public class student {
static String st;
static String st1;

void studentclass(String st,String st1) 
	{
	
	System.out.println("student name"+" "+st);
	System.out.println("student name"+" "+st1);

	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the student name:");
		st = sc.nextLine();
		
		System.out.println("enter the student name:");
		st1 = sc.nextLine();
		
		System.out.println("the student name:"+" "+st);
		System.out.println("the student name:"+" "+st1);
		
		
		if (st == ""|| st1 == "")
			
			System.out.println("the given name of the student is:unkown");
			
		{
			student obj = new student();
		    obj.studentclass(st,st1);

		    }
	
}
}