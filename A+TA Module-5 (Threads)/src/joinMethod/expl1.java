package joinMethod;

import java.io.*;

class ThreadJoining extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.print("\ncurrentThread:" + Thread.currentThread().getName());
			} catch (Exception ex) {
				System.out.println("exception has been catch" + ex);
				System.out.println(i);
			}
		}
	}
}

public class expl1 {
	public static void main(String args[]) {
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		t1.start();

		try {
			System.out.println("cutrrent thread1" + Thread.currentThread().getName() );
			t1.join();
		} catch (Exception ex) {
			System.out.println("thread exception catch" + ex);
			t2.start();
		}
		try {
			System.out.println("cutrrent thread2" + Thread.currentThread().getName());
			t2.join();
		} catch (Exception ex) {
			System.out.println("thread exception catch" + ex);
			t3.start();
		}
	}
}
