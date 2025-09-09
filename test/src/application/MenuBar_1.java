package application;

// Java program to create a menu bar and add
// menu to it and also add menuitems to menu
import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;
public class MenuBar_1 extends Application {
    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("creating MenuBar");
        // create a menu
        Menu m = new Menu("Menu");
        // create menuitems
        MenuItem m1 = new MenuItem("Vice-Chancellor");
        MenuItem m2 = new MenuItem("Vice-Director");
        Menu m3 = new Menu("Dean");
        
        // add menu items to menu
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);
        
        MenuItem subM1 = new MenuItem("Register");
        Menu subM2 = new Menu("Teaching Faculty");
        MenuItem subM3 = new MenuItem("Non-Teaching Faculty");
        
        m3.getItems().addAll(subM1,subM2,subM3);
        
        Menu sub1 = new Menu("facultyDetails");
        Menu sub2 = new Menu("TimeTabel");
        
        subM2.getItems().addAll(sub1,sub2);
        
        Menu st = new Menu("select slot");
        sub1.getItems().addAll(st);
        
        MenuItem Slot1 = new MenuItem("A+TA");
        MenuItem slot2 = new MenuItem("A+TB");
        MenuItem slot3 = new MenuItem("A+tc");
        
      
        st.getItems().addAll(Slot1,slot2,slot3);
        
      
        MenuItem f1 = new MenuItem("nagendra challa");
        MenuItem f2 = new MenuItem("arekula kichu");
        MenuItem f3 = new MenuItem("prasanth maroju");
        sub1.getItems().addAll(f1,f2,f3);
        
        // create a menubar
        
        Menu menu = new Menu("Hostel");
        
        MenuBar mb = new MenuBar();
        // add menu to menubar
        mb.getMenus().add(m);
        mb.getMenus().add(menu);
        // create a VBox
        VBox vb = new VBox(mb);
        // create a scene
        Scene sc = new Scene(vb, 500, 300);
        // set the scene
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}