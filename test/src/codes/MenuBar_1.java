package codes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MenuBar_1 extends Application {

    private Object Submenu;

    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle(" VIT-AP");

        // create a menu
        Menu m = new Menu("Click to know about VITAP");

        // create menuitems
        MenuItem m1 = new MenuItem("Vice-President");
        Menu m2 = new Menu("Vice-Chancellor");
        MenuItem m3 = new MenuItem("Registrar");

        // add menu items to menu
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);

        //creating sub-menus
        //Creating menu items for the sub item edit
        MenuItem sub1 = new MenuItem("Dean");
        MenuItem sub2 = new MenuItem("Teaching Staff");
        MenuItem sub3 = new MenuItem("Non-Teaching Staff");

        m2.getItems().addAll(sub1,sub2,sub3);

        // create a menubar
        MenuBar mb = new MenuBar();

        // add menu to menubar
        mb.getMenus().add(m);

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