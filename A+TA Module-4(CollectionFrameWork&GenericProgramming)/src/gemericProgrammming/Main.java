package gemericProgrammming;

class DemoClass{
	public <T> void genericmethod(T data) {
		System.out.println("generic method:");
		System.out.println("data passed:"+data);
	}
}
public class Main {
		public static void main(String srgs[]) {
			DemoClass demo = new DemoClass();
			demo.<String> genericmethod("java programming");
			demo.<Integer> genericmethod(23);
		}
}
