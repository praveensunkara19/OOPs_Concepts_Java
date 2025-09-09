package WrapperCalss;

public class wrapper1 {
	public static void main(String[] args) {
		int aobj = 5;
		double bobj = 5.67;
		
		Integer a = Integer.valueOf(aobj);
		Double b = Double.valueOf(bobj);
		if(a instanceof Integer) {
			System.out.println("an object of integer crated");
		}
		if(b instanceof Double) {
			System.out.println("an object of Double crated");
		}
	}
}
