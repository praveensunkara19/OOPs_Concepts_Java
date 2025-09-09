package practice;

public class objectClass implements Cloneable{
	int regno;
	String name;
	objectClass(int roll,String username){
		regno = roll;
		name = username;
	}
protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
public static void main(String args[]) throws CloneNotSupportedException 
{
	objectClass obj1 = new objectClass(2021998259,"praveensunkara");
	objectClass obj2 = (objectClass)obj1.clone();
	System.out.println(obj1.regno+ " "+obj1.name);
	System.out.println(obj2.regno+" "+obj2.name);
}
}
