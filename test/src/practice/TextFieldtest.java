package practice;

import javafx.application.Application;  

import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;  


public class TextFieldtest extends Application{
	public void start(Stage primaryStage) throws Exception{
		Label lb1 = new Label("FullName");
		Label lb2 = new Label("E-Mail");
		Label lb3 = new Label("Contact-Number");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3= new TextField();
		TextField tf4 = new TextField();
		TextField tf5 = new TextField();
		Button bt1 = new Button("submit");
		
		bt1.setOnAction(e->System.out.println("your Name:"+tf1.getText()+"-"+tf2.getText()+"\nE-mail:"+
		tf3.getText()+"\nContact detatails:"+tf4.getText()+","
		+tf5.getText()));
		
		GridPane root = new GridPane();
		root.addRow(0,lb1,tf1,tf2);
		root.addRow(2,lb2,tf3);
		root.addRow(6,lb3,tf4,tf5);
		root.add(bt1,10,8);
		
		Scene scene = new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextFieldExample");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
