package assignment_1;
//1. Write a Program to find the factorial of a given number using recursion 
//and analyze the time complexity.
public class qsn_2 {
	int n;
	public static int fact(int n) {
		if(n==0) {
			return 1;}
		else {
			return(n*fact(n-1));
			}
		}
	public static void main (String args[]) {
		System.out.println("the factorial of of n is:"+fact(5));
	}

}
