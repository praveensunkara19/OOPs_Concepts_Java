package assignment_2;

import java.util.Scanner;
import java.util.Arrays;  
public class Qsn_3 {

public static void main(String args[])   
{  
//defining an array of type String  

System.out.println("enter the length of the array:");

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String str[] = new String [n];
for(int i=0;i<n;i++) {
	String m=sc.nextLine();
	str[i]=m;
}
//logic for sorting   
for(int i = 0; i<n-1; i++)   
{  
for (int j = i+1; j<str.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(str[i].compareTo(str[j])>0)   
{  
//swapping array elements  
String temp = str[i];  
str[i] = str[j];  
str[j] = temp;  
}  
}  
}  
//prints the sorted array in ascending order  
System.out.println("the sorted array is:"+Arrays.toString(str));  
}  
}  


