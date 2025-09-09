package exteningTherad;

import java.io.*;

import java.util.*;
	
public class expl1 extends Thread{
	public  void run() {
		System.out.println("thread is running..");
		
	}
	public static void main(String[] args) throws Exception{
		expl1 obj = new expl1();
		obj.start();
		
	}

}
