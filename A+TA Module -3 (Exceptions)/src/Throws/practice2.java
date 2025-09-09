package Throws;
//throws keyword is used to checked exceptons
//so for checked exceptions loke FileNotFound,IOExceptions,ClassNotFound ect..
//so we need to import io library...
//for exception propagation

import java.io.IOException;

public class practice2 {
		void method1() throws IOException{
			throw new IOException("exception is handled");
		}
		void method2() throws IOException{
			method1();
		}
		void method3() {
			try {
				method2();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		public static void main(String[] args) {
			practice2 p = new practice2();
			p.method3();
			System.out.println("normai flow...");
		}
}
