package gemericProgrammming;

public class expl3 {
public static <E> void printArray(E[] elements) {
	for(E element:elements) {
		System.out.println(element);
	}
	System.out.println();
}
	public static void main(String[] args) {

			Integer[] intArray = {10,20,30,49,50};
			Character [] charArray  = {'e','f','d','r'};
			System.out.println("printing the Integer Array");
			printArray(intArray);

			System.out.println("printing the Character Array");
			printArray(charArray);
	}

}
