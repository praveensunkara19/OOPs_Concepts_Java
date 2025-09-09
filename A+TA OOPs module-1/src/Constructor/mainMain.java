package Constructor;

public class mainMain{		//class-MainMain
	int modelYear;
	String modelName;
	
	public mainMain(int year,String name) 
	{
		modelYear = year;
		modelName = name;
	}
public static void main(String[] args) {
	mainMain obj = new mainMain(1967,"mustang");
	System.out.println(obj.modelYear+" "+obj.modelName);
	
}
}

