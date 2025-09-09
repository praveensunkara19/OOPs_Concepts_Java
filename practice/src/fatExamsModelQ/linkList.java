/*2.Can I design an object of type LinkLsit<Int>.Illustrate with an example. 
 * Mention if there are any other alternatives available.*/ 

package fatExamsModelQ;

//by using the generic programming we can define the classes for different paramters 
class genericClass<Int extends Integer>{
	public <T> void generic(T Integer) {
		System.out.println("the method only calls when objects of the class method  ");
	}
}
public class linkList {
		public static void main(String[] args) {
			genericClass<Integer> obj = new genericClass();
			obj.<Integer>generic(4);
		}
}
