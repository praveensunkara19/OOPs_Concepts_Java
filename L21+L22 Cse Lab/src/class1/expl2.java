package class1;

public class expl2 {
	int x,y;
	
	public void method1(int x,int y){
		
		System.out.println(x+y);
	}
public static void main(String[] args) {
	expl2 obj = new expl2();
	System.out.println("sum=");
	obj.method1(2,3);
}
}
