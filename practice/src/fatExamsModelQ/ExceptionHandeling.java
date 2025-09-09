/*4.Every time an exceptional condition arisesin a java program, 
 * an objectfor respective exception class is created and thrown in the methodthat causes exception.
 *  What does this statement signify? Illustrate with an example. */
package fatExamsModelQ;

class exception  {
	public  void method() {
		int i = 50/0;
	}
}
public class ExceptionHandeling {

	public static void main(String[] args) {
		try {
			exception obj = new exception();
			obj.method();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		

	}

}
