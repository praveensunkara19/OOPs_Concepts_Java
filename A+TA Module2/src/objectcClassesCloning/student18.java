package objectcClassesCloning;

public class student18 implements Cloneable {			//cloneable is a interface
	int roll;
	String name;
	student18(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
protected Object clone() throws CloneNotSupportedException{		//syntax to create a clone object
return super.clone();}									//super is the objectclass(parentclass of all classes)

public static void main(String args[]) throws CloneNotSupportedException //this is used to prevent the errors 
{																		//we got while cloning the objects
	student18 obj = new student18(100,"nani");
	student18 obj2 = (student18)obj.clone();
	System.out.println(obj.roll+" "+obj.name);
	System.out.println(obj2.roll+" "+obj2.name);
}
}