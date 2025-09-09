package practice;

public class methodoverloading {
	 int method(int x,int y) {
		return(x+y);
		
	}
	 int method(int x, int y,int z) {
		return(x+y+z);
	
	}
	 double method(double x,double y) {
		return(x+y);
	}
public static void main(String[] args) {
	methodoverloading obj = new methodoverloading();
	System.out.println(obj.method(10,20));
	System.out.println(obj.method(30,40,10));
	System.out.println(obj.method(30.84,50));
}
}
