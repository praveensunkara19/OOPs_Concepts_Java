package subClassses;

//private inner class

class outer_class{
	int x =5;
	
	private class inner_class{		//we use private to don't want outer objects to access the inner class 
		int y = 10;
	}
}
public class Class1 {
	public static void main(String[] args) {
		outer_class obj1 = new outer_class();
		outer_class.inner_class in_obj = obj1.new inner_class();
		System.out.println(obj1.x + in_obj.y);
		
	}

}
//ans: error