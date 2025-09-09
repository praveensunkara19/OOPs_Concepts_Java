package WrapperCalss;
import java.util.ArrayList;
public class autoBoxing {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(7);
		obj.add(6);
		System.out.println(":ArrayList:"+obj);
		int a = obj.get(0);
		System.out.println("value at index:"+a);
}
}
