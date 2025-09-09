package application;

//package codes;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Vitap extends Application {
   public void start(Stage stage) {
      //Creating tree items
      TreeItem root1 = new TreeItem("vice chancellor");
      TreeItem item1 = new TreeItem("vice President");
      TreeItem item2 = new TreeItem("register");

      //Adding elements to root1
      root1.getChildren().addAll(item1, item2);
      
      TreeItem root3 = new TreeItem("dean");
      TreeItem item7 = new TreeItem("staff");
      TreeItem item8 = new TreeItem("non-teaching staff");
      TreeItem item9 = new TreeItem("register");
      
      //Adding elements to root2
      root3.getChildren().addAll(item7, item8, item9);
      
//      list View for educational qualification
      TreeItem<String> base = new TreeItem<String>("vit-Ap");
      base.setExpanded(true);
      base.getChildren().addAll(root1, root3);
      
      //Creating a TreeView item
      TreeView view = new TreeView(base);
      view.setPrefHeight(300);
      VBox pane = new VBox(10);
      pane.setPadding(new Insets(5, 5, 5, 50));
      pane.getChildren().addAll(view);
      
      //Setting the stage
      Group node = new Group(pane);
      Scene scene = new Scene(node, 595, 320, Color.BEIGE);
      stage.setTitle("List View Example");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}