package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox hb = new VBox();
        FlowPane fb = new FlowPane();
        FlowPane fb2 = new FlowPane();
        ScrollPane sp = new ScrollPane();
        Label txt = new Label();


        DataBase<Number> dataBase = new DataBase<>();


        TextField enterInput = new TextField();
        enterInput.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode().equals(KeyCode.ENTER)) {
                    Double number = Double.parseDouble(enterInput.getText());
                    Integer integer = number.intValue();
                    if(integer.doubleValue() == number){
                        dataBase.add(integer);
                    }
                    else{
                        dataBase.add(number);
                    }
                    txt.setText(dataBase.toString());
                    enterInput.clear();
                }
            }
        });
        fb.getChildren().addAll(new Label("Enter a number: "), enterInput);
        fb.setPadding(new Insets(30, 30, 30, 30));

        sp.setContent(txt);
        sp.setMinHeight(200);

        Button[] buttons = {new Button("Sort"), new Button("Shuffle"), new Button("Reverse")};
        fb2.getChildren().addAll(buttons);
        fb2.setPadding(new Insets(50, 50, 50, 50));
        for(int i = 0; i < buttons.length; i++){
            int finalI = i;
            buttons[i].setOnAction(event -> {
                switch (finalI){
                    case 0:dataBase.sort();break;
                    case 1:dataBase.shuffle();break;
                    default:dataBase.reverse();break;
                }
                txt.setText(dataBase.toString());
            });
            buttons[i].setPadding(new Insets(40, 40, 40, 40));
        }

        hb.getChildren().addAll(fb, sp, fb2);
        Scene root = new Scene(hb, 500, 500);
        primaryStage.setScene(root);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
class DataBase<E extends Number> extends ArrayList<E>{

    public void shuffle(){
        Collections.shuffle(this);
    }
    public void sort(){
        Collections.sort(this, new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                if(o1.doubleValue() > o2.doubleValue()){
                    return 1;
                }
                else if(o1.doubleValue() < o2.doubleValue()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
    }
    public void reverse(){
        Collections.reverse(this);
    }
    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < size(); i++){
            res = res.concat(get(i) + " ");
        }
        return res;
    }
}
