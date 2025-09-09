package class1;

public class exp1 {
	 int x;
	 int y;
	 int z;
	exp1(int x,int y){
		this.x = x;
		this.y = y;
	}
	exp1(int a,int b,int c){
		x= a;
		y = b;
		z = c;
	}
	public static void main(String[] args) {
		exp1 obj =  new exp1(22,33);
		System.out.println(obj.x+obj.y);
		
		exp1 obj1 =  new exp1(22,33,44);
		System.out.println(obj1.x+obj1.y+obj1.z);
		
	}
}
	