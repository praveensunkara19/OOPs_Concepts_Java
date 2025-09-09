package subClassses;

class outer_demo{
	int num;	

	private class inner_demo{
		public void print(){
			System.out.println("this is inner class");
		}}
	void display_inner() {

		inner_demo inner = new inner_demo();
		inner.print();
	}
}
public class example {
	public static void main(String[] args) {
		outer_demo outer = new outer_demo();
		outer.display_inner();
	}
}
