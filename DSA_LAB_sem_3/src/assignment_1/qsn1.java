package assignment_1;
import java.util.*;

public class qsn1 {
	static int i;
	static int n;
	static int sum;
	
	public static int fact(int n) {
		if(n==0) {
			return 1;}
		else {
			return(n*fact(n-1));
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		n = sc.nextInt();
		for(i=0;i<=n+1;i++) {
			sum = i*(i+1);
			sum+=sum;
		}
	System.out.println("factorial of:"+n+"is:"+sum);
	
	System.out.println("the factorial of of n is:"+fact(n));
		}
	}


