package implemetingRunnable;

import java.util.*; 
import java.io.*;
public class expl1 implements Runnable{
	public void run(){
		System.out.println("thead is running successfully");
	}
	public void stop() {
		System.out.println("thread is stopped!");
	}
	public static void main(String []args) {
	expl1 obj = new expl1 ();
	
	expl1 obj2 = new expl1(); 
	
	Thread t1 = new Thread(obj);
	
	t1.start();
	
}}
