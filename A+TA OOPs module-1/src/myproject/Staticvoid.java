/**accessing the non-static methods using the object */
package myproject;//package

public class Staticvoid //class
{
	
	//created a non static method with some variables
	public void mycar(String str,int maxspeed) //method 
	{
		
	System.out.println("the maxspeed of the car"+" "+str+" "+maxspeed);
	//assigning the variables to print
   }
	public static void main(String[] args) //main method
	{
		Staticvoid nonsv = new Staticvoid(); 
		//we created the object to pritn that non static method 
		
		nonsv.mycar("lamborghini",400); 
		//we assigned the some values to the variables which is in the method 
		
	}
	

}
