package Synchoronisation;
import java.io.*;
import java.util.*;

// A Class used to send a message
class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t" + msg );
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
// Class for send a message using Threads
class ThreadSend extends Thread
{
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent

    ThreadSend(String m, Sender obj) //constructor
    {
        msg = m;
        sender = obj;
    }
    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronised(sender);
        {
            // synchronizing the send object
            sender.send(msg);
        }
    }
	private void synchronised(Sender sender2) {
		// TODO Auto-generated method stub
		
	}
}
// Driver class
class syncDemo
{
    public static void main(String args[])
    {
        Sender send = new Sender();
        ThreadSend S1 =
            new ThreadSend( " Hi " , send );
        ThreadSend S2 =
            new ThreadSend( " Bye " , send );
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();
        // wait for threads to end
        try{
            S1.join();
            S2.join();
        }
        catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}