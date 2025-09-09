package class2;

public class StringMethods {
	public static void main(String[] args) {
//methods of the string class
		
	String str = " PraveenSunkara19 ";		
	
//	lower and upper case
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
//	trim() method
	System.out.println(str.trim());
	
//	charAt() method to axis the characters
	System.out.println(str.charAt(1));
	System.out.println(str.charAt(16));
	
//	length() method to know the length of the string
	System.out.println(str.length());
	
//	intern method()
	String s1 = "nani19";
	String s2 = s1.intern();
	System.out.println(s2);
	
//	valueof method() to calculate the values
	String a = "praveen";
	String s = String.valueOf(a);
	System.out.println(s+10);
	
//	replace() method used to replace the any word in the string
	String str1 = "cricket is most famous game in india.crocket players have huse fans all over the world";
	String replaceString = s2.replace("cricket","football");
	System.out.println(replaceString);
	
}
}
