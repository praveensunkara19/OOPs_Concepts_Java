package Assignment1;

class rectangle{
	int l,b;						//instance variables
	
	public rectangle(int length,int breadth) {		//constructor
		l = length;									//local variables
		b = breadth;
	}
	void perimeter() {											//method
		System.out.println("the perimeter :"+" "+2*(l+b));
	}
	void area() {
		System.out.println("the area "+" "+ (l*b));
	}
}

class sqare extends rectangle{							//using inheritance 
	public sqare(int s) {								//created a constructor
		super(s,s);									//using the super keyword assigning the variables  
													//of square constructor to the l,b of rectangle constructor
	}
}



public class perimeterArea {
	public static void main(String[] args) {
		rectangle rec = new rectangle(5,10);
		rectangle sq = new sqare(10);
		
		rec.perimeter();
		rec.area();			
											//calling the methods
		sq.perimeter();
		sq.area();
		
		
	}

}
