package assignment_2;

import java.util.Scanner;
public class Qsn_1 {
	static int n;
	static int m,i,temp;
	static int p;
	
	public static void sort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		n = sc.nextInt();
		System.out.println("enter the numbers of the array:");
		int [] arr = new int[n];
		
		for(int i=0;i<n-1;i++){
			m = sc.nextInt();
			arr[i]= m;
		}
		for(int j=0;j<=n-1;j++) {
			System.out.print(arr[j]+" ");
		}
		for(p=0;p<n-1;p++) {
			if(arr[p]>arr[p+1]) {
			temp=arr[p];
			arr[p]=arr[p+1];
			arr[p]=temp;}
			
		}
		System.out.print(arr[p]+" ");
		}
	
	public static void main(String[] args) {
		sort();
		}

}
