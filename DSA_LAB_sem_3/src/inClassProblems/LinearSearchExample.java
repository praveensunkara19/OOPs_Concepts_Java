package inClassProblems;
import java.util.Scanner;


public class LinearSearchExample {
	public static int linearSearch(int[]arr,int key) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
			return i;
			}
		}
		 return -1;
	}
	public static void main(String a[]) {
		int[] a1 = {10,20,30,40,50,70,90};
		System.out.println("enter the element to search:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
//		int key = 50;
		System.out.println(key+" "+"is found at index:"+linearSearch(a1,key));
	}
}
