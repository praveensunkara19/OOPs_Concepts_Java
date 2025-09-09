package awtPackage;
import java.awt.*;

public class expl2  extends Frame{	//by using the association
	expl2(){
		Frame f = new Frame();	//creating the frsme
		
		Label l = new Label("name:");	//crating the label
		
		Button b = new Button("submit");	//crated the button
		
		TextField t = new TextField();  	//created the TextField
		
		l.setBounds(20, 80, 80, 30);
		b.setBounds(20, 100, 80, 30);
		t.setBounds(100, 100, 80, 30);
		
		//adding the components to the frame
		f.add(l);
		f.add(b);
		f.add(t);
		
		f.setSize(400,300);
		
		f.setTitle("this is the awt programme");
		
		f.setLayout(null);
		f.setVisible(true);
		
}


	public static void main(String[] args) {
		expl2 obj = new expl2();
	}

}
