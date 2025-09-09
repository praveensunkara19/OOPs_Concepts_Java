package awtPackage;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AWTExample2 {
	 Frame f;
	// initializing using constructor  
	   AWTExample2() {  
	  
	      // creating a Frame  
	     f = new Frame();  
	  
	      // creating a Label  
	      Label l = new Label("Employee id:");   
	  
	      // creating a Button  
	      Button b = new Button("Submit");  
	  
	      // creating a TextField  
	      TextField t = new TextField();  
	  
	      // setting position of above components in the frame  
	      l.setBounds(20, 80, 80, 30);  
	      t.setBounds(20, 100, 80, 30);  
	      b.setBounds(100, 100, 80, 30);  
	  
	      // adding components into frame    
	      f.add(b);  
	      f.add(l);  
	      f.add(t);  
	  
	      // frame size 300 width and 300 height    
	      f.setSize(400,300);  
	  
	      // setting the title of frame  
	      f.setTitle("Employee info");   
	          
	      // no layout  
	      f.setLayout(null);
	  
	      // setting visibility of frame  
	      f.setVisible(true);  
//	      f.setVisible(false);
	}    
	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
			new AWTExample2();  
	
	  
	}    
}
