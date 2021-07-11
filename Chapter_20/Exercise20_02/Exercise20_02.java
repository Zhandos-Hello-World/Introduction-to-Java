/*
(Store numbers in a linked list) Write a program that lets the user enter numbers from a graphical user interface and displays them in a text area, as shown
in Figure 20.17a. Use a linked list to store the numbers. Do not store duplicate numbers. Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and
reverse the list.

*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise20_02 extends Application {
    private TextArea ta = new TextArea();
    private LinkedList<Integer> list = new LinkedList<>();

    @Override
    public void start(Stage stage) {
        //JAVAFX
        TextField field = new TextField();
        ta.setWrapText(true);

        Button[]btn = {new Button("Sort"), new Button("Shuffle"), new Button("Reverse")};

        stage.setScene(new Scene(new VBox(new HBox(10, new Label("Enter a number: "), field),
                new ScrollPane(ta), new HBox(10, btn))));
        stage.show();


        //adding
        field.setOnKeyPressed(E -> {
            if(E.getCode() == KeyCode.ENTER){
                list.add(Integer.parseInt(field.getText()));
                ta.appendText(field.getText() + " ");
                field.clear();
            }
        });

        //sort
        btn[0].setOnAction(e -> {
            Collections.sort(list);
            display();
        });

        //shuffle
        btn[1].setOnAction(e -> {
            Collections.shuffle(list);
            display();
        });

        //reverse
        btn[2].setOnAction(e -> {
            Collections.reverse(list);
            display();
        });
    }
    public void display(){
        ta.clear();
        list.forEach(event -> ta.appendText(event + " "));
    }

    public static void main(String[]args){
        launch(args);
    }
}
