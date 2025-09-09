package assignment_1;
//2. Write a Program to find the transpose of a given matrix and display its time complexity.

import java.util.*;
public class qsn_1 {
	static int i;
	static int j;
	public static void main(String[] args) {
		 int arr[][] = {{1,2,3},{2,3,4},{4,5,6}};
		 System.out.println("the transposed matrix:");
		 for(i=2;i>=0;i--) {
			 for(j=2;j>=0;j--) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
	}
