package awtPackage;

import java.awt.*;

class awt extends Frame{		
	public void awt1(){
		Button b = new Button("click Here");
		setSize(300,380);
		b.setBounds(20,40,40,20);
		add(b);		//adding to frame 
		setLayout(null);
		setVisible(true);
	}
}
public class exmp1 {

	public static void main(String[] args) {
			awt obj = new awt();
			obj.awt1();
	}

}
