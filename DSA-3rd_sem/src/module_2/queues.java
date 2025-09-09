package module_2;

public class queues {
	
	static int q[]= new int[5];
	static int n=q.length;
	static int front = -1;
	static int rear = -1;
	
	//creating the methods of IsEmpty and IsFull 
	static boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean ifFull() {
		if(front==0 && rear==n-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
