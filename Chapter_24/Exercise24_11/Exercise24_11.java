import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.LinkedList;
import java.util.ListIterator;

/*
(Animation: doubly linked list) Write a program to animate search, insertion,
and deletion in a doubly linked list, as shown in Figure 24.24. The Search button
searches the specified value in the list. The Delete button deletes the specified
value from the list. The Insert button appends the value into the list if the index
is not specified; otherwise, it inserts the value into the specified index in the list.
Also add two buttons named Forward Traversal and Backward Traversal for
displaying the elements in a forward and backward order, respectively, using
iterators, as shown in Figure 24.24. The elements are displayed in a label
*/
public class Exercise24_11 extends Application {
    final static LinkedList<String> list = new LinkedList<>();
    Stage mainStage;
    HBox line = new HBox();
    Label titleWord = new Label("");

    @Override
    public void start(Stage stage) {
        displayByDefault();
        titleWord.setWrapText(true);
        titleWord.setPadding(new Insets(10, 10, 10, 10));

        VBox root = new VBox(titleWord, line, controller());

        mainStage = stage;
        mainStage.setScene(new Scene(root, 900, 200));
        mainStage.setResizable(false);
        mainStage.setTitle("Exercise24_11: Doubly Linked List Animation");
        mainStage.show();
    }
    public Pane controller(){
        Label[]lbl = new Label[2];
        lbl[0] = new Label("Enter a value:");
        lbl[1] = new Label("Enter an index:");
        for (Label label : lbl) label.setFont(Font.font("Book Antiqua", 14));

        Button[]btn = new Button[5];
        btn[0] = new Button("Search");
        btn[1] = new Button("Insert");
        btn[2] = new Button("Delete");
        btn[3] = new Button("Forward Traversal");
        btn[4] = new Button("Backward Traversal");

        TextField value = new TextField();
        TextField index = new TextField();

        HBox root = new HBox(5, lbl[0], value, lbl[1], index, btn[0], btn[1], btn[2], btn[3], btn[4]);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPadding(new Insets(0, 0, 10, 0));


        btn[0].setOnAction(e -> {
            String valueStr = value.getText();
            if(list.contains(valueStr)){
                for(int i = 0; i < list.size(); i++)
                    if(list.get(i).equals(valueStr)){
                        message("The value " + valueStr + " is at index " + i + " in the list");
                        break;
                    }
            }
            else{
                if(valueStr.trim().length() == 0)
                    message("The value is not in the list");
                else
                    message("The value " + valueStr +" is not in the list");
            }
        });
        btn[1].setOnAction(e -> {
            int indexInt = (check(index.getText()) == -1)?list.size():check(index.getText());
            String valueStr = value.getText();
            if(valueStr.trim().length() == 0)
                message("no value entered");
            else {
                list.add(indexInt, valueStr);
                current();
            }
        });
        btn[2].setOnAction(e -> {
            int indexInt = check(index.getText());
            String valueStr = value.getText();
            if(valueStr.trim().length() == 0){
                if(indexInt == -1){
                    message("No value or index entered");
                }
                else{
                    list.remove(indexInt);
                    current();
                }
            }
            else{
                if(list.contains(valueStr)){
                    list.remove(valueStr);
                    current();
                }
                else{
                    message(valueStr + " is not in the list");
                }
            }
        });
        btn[3].setOnAction(e -> {
            titleWord.setText("");
            ListIterator<String> iterator = list.listIterator();
            titleWord.setText("Forward Traversal: ");
            while(iterator.hasNext())
                titleWord.setText(titleWord.getText() + iterator.next() + " ");
        });
        btn[4].setOnAction(e -> {
            titleWord.setText("");
            ListIterator<String> iterator = list.listIterator(list.size());
            titleWord.setText("Backward Traversal: ");
            while(iterator.hasPrevious())
                titleWord.setText(titleWord.getText() + iterator.previous() + " ");
        });
        return root;

    }
    public void current(){
        titleWord.setText("");
        line.getChildren().clear();
        Label[]labels = {new Label("head"), new Label("tail")};
        if(list.isEmpty()){
            displayByDefault();
        }
        else if(list.size() == 1){
            HBox headTail = new HBox(10, labels);
            VBox vbox = new VBox(headTail, rec(list.getFirst()), rec("next"), rec("previous"));
            line.getChildren().add(vbox);
        }
        else{
            for(int i = 0, index = 0; i < list.size(); i++, index+=2){
                if(i == 0){
                    VBox vBox = new VBox(labels[0], rec(list.getFirst()), rec("next"), rec("previous"));
                    line.getChildren().addAll(vBox, link());
                }
                else if(i == list.size() - 1){
                    VBox vBox = new VBox(labels[1], rec(list.getLast()), rec("next"), rec("previous"));
                    line.getChildren().add(vBox);
                }
                else{
                    VBox vBox = new VBox(new Label(), rec(list.get(i)), rec("next"), rec("previous"));
                    line.getChildren().addAll(vBox, link());
                }

            }
        }
    }
    public Pane link(){
        Line[]lines = new Line[6];

        lines[0] = new Line(0, 50, 30, 25);
        lines[1] = new Line(30, 25, 25, 35);
        lines[2] = new Line(30, 25, 20, 28);

        lines[3] = new Line(0, 35, 30, 80);
        lines[4] = new Line(0, 35, 9, 42);
        lines[5] = new Line(0, 35, 3, 45);

        return new Pane(lines);
    }




    public int check(String input){
        int num = -1;
        int q;
        try{
            q = Integer.parseInt(input);
        }
        catch (NumberFormatException ex){
            return num;
        }
        if(q < 0 || q >= list.size())
            return num;
        return Integer.parseInt(input);
    }


    public void displayByDefault(){
        line.setPadding(new Insets(10, 10, 10, 10));
        line.setPrefHeight(150);
        VBox vbox = new VBox(new Label("head: null"), new Label("tail: null"));
        line.getChildren().addAll(vbox);
    }
    public StackPane rec(String value){
        Rectangle rec = new Rectangle(50, 25, Color.WHITE);
        rec.setStroke(Color.BLACK);
        Label label = new Label(value);

        return new StackPane(rec, label);
    }

    public void message(String message){
        Stage stage = new Stage();
        stage.setTitle("Alert");
        Button ok = new Button("OK");
        Label label = new Label(message);
        label.setWrapText(true);
        VBox vBox = new VBox(10, label, ok);
        vBox.setPrefSize(200, 100);
        vBox.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(vBox));
        stage.setResizable(false);
        stage.show();
        ok.setOnAction(e -> stage.close());
    }
    public static void main(String[]args){
        launch(args);
    }
}
