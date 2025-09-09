package CLASS_3;

public class wrapperCalss {
	public static void main(String args[]) {
		//converting the primitive data types into wrapper class objects
		char a = 'a';
		int b = 1;
		short c = 49;
		long d = 203;
		float e = 20.5f;
		byte f = 1;
		
		//autoboxing
		System.out.println("auto boxing of the primitive datatyped into wrapper class objects");
		Character charobj = a;
		Integer intobj = b;
		Short shortobj = c;
		Long longobj = d;
		Float floatobj = e;
		Byte byteobj = f;
		
		System.out.println(charobj);
		System.out.println(intobj);
		System.out.println(shortobj);
		System.out.println(longobj);
		System.out.println(floatobj);
		System.out.println(byteobj);
		
		//to get the objects of the wrapper class objects
		System.out.println("\n"+"another method to get the objects");
		System.out.println(charobj.charValue());
		System.out.println(intobj.intValue());
		System.out.println(shortobj.shortValue());
		System.out.println(longobj.longValue());
		System.out.println(floatobj.floatValue());
		System.out.println(byteobj.byteValue());
		
		//unboxing
		System.out.println("\n"+"unboxing of the wrapper class objects");
		char charvalue = a;
		int intvalue = b;
		short shortvalue = c;
		long longvalue = d;
		float floatvalue = e;
		byte bytevalue = f;
		
		System.out.println(charvalue);
		System.out.println(intvalue);
		System.out.println(shortvalue);
		System.out.println(longvalue);
		System.out.println(floatvalue);
		System.out.println(bytevalue);
		
//	toString is a method which converts the datatypes into string datatype 
		// which helps us to get the length of the datatype
		System.out.println("\n"+"by toString method we can get the length of each object of wrapper class");
		String str1 = intobj.toString();		
		System.out.println("\n"+str1.length());
		String str2 = floatobj.toString();		
		System.out.println("\n"+str2.length());
		
		String str3 = charobj.toString();		
		System.out.println("\n"+str3.length());
		
		String str4 = byteobj.toString();		
		System.out.println("\n"+str4.length());
		
		String str5 = shortobj.toString();		
		System.out.println("\n"+str5.length());
		
		String str6 = longobj.toString();		
		System.out.println("\n"+str6.length());	
	}
}