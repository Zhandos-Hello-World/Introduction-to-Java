/*
(Store numbers in a linked list) Write a program that lets the user enter numbers from a graphical user interface and displays them in a text area, as shown
in Figure 20.17a. Use a linked list to store the numbers. Do not store duplicate numbers. Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and
reverse the list.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {
    TextField number = new TextField();
    Button[]buttons = {new Button("Sort"), new Button("Shuffle"), new Button("Reverse")};
    TextArea ta = new TextArea();
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void start(Stage stage){
        ta.setWrapText(true);

        HBox first = new HBox(10, new Label("Enter a number: "), number);
        first.setAlignment(Pos.CENTER);

        HBox buttonPane = new HBox(10, buttons);
        buttonPane.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(new VBox(10, first, new ScrollPane(ta), buttonPane)));
        stage.setResizable(false);
        stage.show();

        number.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.ENTER){
                list.add(Integer.parseInt(number.getText()));
                ta.clear();
                ta.appendText(forTextArea(list));
                number.clear();
            }
        });

        for(int i = 0; i < buttons.length; i++){
            int finalI = i;
            buttons[i].setOnAction(e ->{
                switch (finalI){
                    case 0:Collections.sort(list);ta.clear();ta.appendText(forTextArea(list));break;
                    case 1:Collections.shuffle(list);ta.clear();ta.appendText(forTextArea(list));break;
                    case 2:Collections.reverse(list);ta.clear();ta.appendText(forTextArea(list));break;
                }
            });
        }

    }
    public String forTextArea(ArrayList<Integer> list){
        String s = "";
        for(Integer value:list){
            s = s.concat(value + " ");
        }
        return s;
    }

    public static void main(String[]args){
        launch(args);
    }
}
