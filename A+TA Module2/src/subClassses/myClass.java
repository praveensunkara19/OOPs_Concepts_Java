package subClassses;

class outerclass {
	int x = 5;
	static class innerclass{
		int  y = 10;
	}
}




public class myClass{
	public static void main(String[] args) {
//		outerclass myouter = new outerclass();
		outerclass.innerclass myobj = new outerclass.innerclass();
		System.out.println(myobj.y);
//		outerclass.innerclass myinner = myouter.new innerclass();
//		System.out.println(myinner.y*myouter.x);
	}
}
	