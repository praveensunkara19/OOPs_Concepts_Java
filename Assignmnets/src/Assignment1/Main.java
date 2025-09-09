/**
 2) Write a java program to show overriding of methods in a class 
 */

package Assignment1;

class class1 //let this class1 be parentclass
   {
	void method() //method 
	{
		System.out.println("superclass/parentclass");
	}
	
   }	

class class2 extends class1 	//class2 is the childclass
								//class2 is in inheritance with class1
	{
	
	void method() 			//in method override the method name of two class should be same
	{
		System.out.println("subclass/childclass");
	}
	}

public class Main{
	public static void main(String[] args)   //mainmethod
	{
		class1 obj1 = new class1();		//If a class1 type reference refers
		obj1.method();					// to a class1 object, then class1's
        								// method is called
		
		class1 obj2 = new class2();		//if class1 type reference refers 
		obj2.method();					//to a class2 object,then class2 method is called
		
		
	}
}