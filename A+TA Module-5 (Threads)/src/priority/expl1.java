package priority;
import java.lang.*;

public class expl1 extends Thread {
	public void run() {
		System.out.println("inside the run method");
	}
	public static void main(String args[]) {
		expl1 t1 = new expl1();
		expl1 t2 = new expl1();
		expl1 t3 = new expl1();
		System.out.println(" priority of the thread t1"+t1.getPriority());
		System.out.println(" priority of the thread t2"+t2.getPriority());
		System.out.println(" priority of the thread t3"+t3.getPriority());
		t1.setPriority(4);
		t2.setPriority(5);
		t1.setPriority(7);
		
		System.out.println("\n priority of the thread t1"+t1.getPriority());
		System.out.println(" priority of the thread t2"+t2.getPriority());
		System.out.println(" priority of the thread t3"+t3.getPriority());
		
		//to set the priority of the main thread
		System.out.println("current ecututing the thread"+Thread.currentThread().getName());
		System.out.println("current ecututing the thread"+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		System.out.println("current ecututing the thread"+Thread.currentThread().getPriority());
		
			
		}
	}

