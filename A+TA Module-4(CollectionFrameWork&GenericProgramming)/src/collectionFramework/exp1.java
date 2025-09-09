package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class exp1 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers);
		
		int number = numbers.get(2);
		System.out.println(number);
		
		int removenumbers = numbers.remove(2);
		System.out.println(numbers);
		System.out.println(removenumbers);
		
		
		for(int element:numbers) {
			System.out.println(element);
		}
	}
}
