package class6Layouts;

import java.awt.*;
import javax.swing.*;

public class gridLayout {
	 JFrame f;
	gridLayout(){
		
		f =new JFrame();
		Label l = new Label("calculated value");
		TextField t = new TextField();
		f.add(l);
		f.add(t);
		
		l.setBounds(20,100,80,20);
		t.setBounds(20,80,80,20);
		
		f.setTitle("simple calculater");
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b11 = new JButton("0");
		JButton bAdd = new JButton("+");
		JButton bsub = new JButton("-");
		JButton bmul= new JButton("X");
		JButton bdiv= new JButton("%");
		JButton beql = new JButton("=");
		
		f.add(b1);f.add(b2);f.add(b3);
		f.add(b4);f.add(b5);f.add(b6);
		f.add(b7);f.add(b8);f.add(b9);
		f.add(b11);f.add(bAdd);f.add(bsub);
		f.add(bmul);f.add(bdiv);f.add(beql);
		
		f.setSize(300,300);
		f.setLayout(new GridLayout(3,4,25,30));
		f.setVisible(true);
		}
	
	public static void main(String[] args) {
		new gridLayout();
		
	}

}
