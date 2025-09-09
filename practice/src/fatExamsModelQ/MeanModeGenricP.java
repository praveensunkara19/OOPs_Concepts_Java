/*15.Write down a generic class named as “Math_Class” with type parameter T where T is numeric
 *  object type. Consider a method “List_Average” that takes an ArrayList of type T as an input
 *   and calculates the mean and median of all the elements in the list. Ensure that the returned
 *    value must be presented as a double type data. To get this result as a double type data you
 *     can use doubleValue(). Note: Median is the middle element of the ArrayLIst. Short the list 
 *     and find out the mid element.
 */
package fatExamsModelQ;

class Math_Class{
	public  <T> void List_Average(T[] elements){
		int l = T.length();
		int x=0;
		for(int i=0;i<l;i++) {
			Integer j = x +j ;
		}
		Integer mean = j%l;
		
//		System.out.println("mean of the array:"+mean);
		
	}
}
public class MeanModeGenricP {

	public static void main(String[] args) {
		Integer arr[] = {1,2,4,5};
		Math_Class obj = new Math_Class();
		obj.List_Average(arr);
		
	}

}
