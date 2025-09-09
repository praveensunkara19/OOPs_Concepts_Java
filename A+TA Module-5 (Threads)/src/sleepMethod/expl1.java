package sleepMethod;

import java.io.*;

import java.lang.Thread;
public class expl1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);   // if we take -ve value of time throws an exception 
				System.out.print(i);
			}
		}
			catch(Exception e){
				System.out.print(e);
				
			}
		}

	}


