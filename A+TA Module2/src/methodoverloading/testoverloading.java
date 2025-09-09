package methodoverloading;

public class testoverloading {
public static void main(String[] args) 
{
	System.out.println("main with another  string");
}
public static void main(String args[]) 
{													//jvm calls only main() methods which contain string as arguments
	System.out.println("main with string  method");
}
public static void main() {
	System.out.println("main without args");
}
}
