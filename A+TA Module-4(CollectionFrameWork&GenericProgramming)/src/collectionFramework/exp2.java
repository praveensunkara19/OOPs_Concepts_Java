package collectionFramework;
import java.util.*;
public class exp2 {
	public static void main(String [] args) {
		
		int arr[] =  {1,2,3};
		
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};  // 2 dimentional array
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(4);
		num.add(6);
		System.out.println(num);
		
		Iterator<Integer> i = num.iterator();
		System.out.println(i);
		
		for(int elements:num) {
			System.out.println(elements);
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		String l = Arrays.toString(arr);  //from Arrays class we have import toString method
		System.out.println(l);
		
//		for multiple dimention arrars we use deepToString method
		String l1 = Arrays.deepToString(arr2);
		System.out.println(l1);
		
				
	}

}
