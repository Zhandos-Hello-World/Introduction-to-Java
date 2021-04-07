package com.company;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application{

    @Override
    public void start(Stage stage){
        VBox vb = new VBox();
        ScrollPane sc = new ScrollPane();
        Button[] buttons = new Button[]{new Button("Suspend"), new Button("Resume"), new Button("+"), new Button("-")};


    }
    public static void main(String[] args) {
        launch(args);
    }
}
