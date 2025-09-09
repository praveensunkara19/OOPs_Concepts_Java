package class2;

public class BufferString {
	public static void  main(String args[]) {
//		append method() to add a another string
		StringBuffer sbfr = new StringBuffer("hello");
		sbfr.append("World");
		System.out.println(sbfr);
		
//		insert() method to insert strings in the palce of index
		StringBuffer sbfr1 = sbfr.insert(5,"Inserted");
		System.out.println(sbfr1);
		
//		replace method() to replace the index strings
		StringBuffer sbfr2 = sbfr.replace(5,12,"Welcome");
		System.out.println(sbfr2);
		
//		delete() method to delete the values in the index
		StringBuffer sbfr3 = sbfr.delete(5,13);
		System.out.println(sbfr3);
		
//		reverse() method to reverse the string
		StringBuffer sbfr4 = sbfr.reverse();
		System.out.println(sbfr4);
		
//		capacity() method to know capacity of the buffer
		int len = sbfr4.length();
		System.out.println(len);
		System.out.println(sbfr4.capacity());
		
		StringBuffer sbfr5 = sbfr4.append("i'm praveen");
		System.out.println(sbfr5);
		System.out.println(sbfr5.length());
		System.out.println(sbfr5.capacity());
		
//		ensurecapacity()
		sbfr5.ensureCapacity(10);
		System.out.println(sbfr5.capacity());
		sbfr5.ensureCapacity(50);
		System.out.println(sbfr5.capacity());
	}
}