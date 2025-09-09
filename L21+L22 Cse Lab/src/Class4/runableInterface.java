package Class4;

import java.lang.Runnable;
class createdClass implements Runnable{
	
	public void run() {		//we crated the override run methos from RunnableInterface
		try {
			System.out.println("Thread is running:" + Thread.currentThread().getName()); 		
			System.out.println("Implementing the runnable interface in Java");
									//here we creating the thread which can run
		}
		catch(Exception e){					// may throw an Exception
			System.out.println("exception is caught:"+ e);
		}
	}
}

public class runableInterface {

	public static void main(String[] args) {
		Thread obj = new Thread(new createdClass()); 
							//we instantiate a Thread object and call start() method on this object 
		obj.start();		
	}

}
