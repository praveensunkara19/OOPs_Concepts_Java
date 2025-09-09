package gemericProgrammming;

import java.util.*;
import java.lang.StringBuilder;

class GenericClass<T extends Number> { // generic class was created

	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("bounded type generic class");
	}

	public ArrayList<Integer> arrayList(){
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Enter the elements into ArrayLIst:");
		for(int i=0;i<5;i++) {
			int n1 = sc.nextInt();
			arr.add(n1);
		}
			StringBuilder arr2 = new StringBuilder();
			for(int a:arr) {
				arr2.append(arr);
	}
			System.out.println(arr2);
			return arr;
	}
		public List<Integer>list(){
			
			System.out.println("Enter the elements into LIst:");

			List<Integer> arr1 = new LinkedList<>();
			
			StringBuilder arr3 = new StringBuilder();
			
			for(int i=0;i<5;i++) {
				int n2 = sc.nextInt();
				arr1.add(n2);
			}
			for(int b:arr1) {
				arr3.append(arr1);
			}
			System.out.println(arr3);

			return arr1;
		}
}

public class ecpl2 {

	public static void main(String[] args) {
		GenericClass<Integer> obj = new GenericClass<>();// we want to pass
															// only the dataTypes of numbers

//		obj.display();
		obj.arrayList();
		obj.list();

	}
}
