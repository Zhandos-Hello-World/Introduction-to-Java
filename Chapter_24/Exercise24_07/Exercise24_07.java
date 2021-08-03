import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.LinkedList;

/*
(Animation: linked list) Write a program to animate search, insertion, and deletion in
a linked list, as shown in Figure 24.1b. The Search button searches the specified value
in the list. The Delete button deletes the specified value from the list. The Insert
button appends the value into the list if the index is not specified; otherwise, it
inserts the value into the specified index in the list.
*/
public class Exercise24_07 extends Application {
    final static LinkedList<String> list = new LinkedList<>();
    Stage mainStage;
    GridPane grid = new GridPane();
    Label titleWord = new Label("Usage: Enter a value and click the Search, Insert, or Delete button to search, insert, or delete the value from the list. Enter a value and an index and then click the Insert button to insert the value in the specified index. Enter an index and then click the Delete button to delete the value in the specified index.");

    @Override
    public void start(Stage stage) {
        displayByDefault();
        titleWord.setWrapText(true);
        titleWord.setPadding(new Insets(10, 10, 10, 10));

        VBox root = new VBox(titleWord, grid, controller());

        mainStage = stage;
        mainStage.setScene(new Scene(root, 700, 270));
        mainStage.setResizable(false);
        mainStage.setTitle("Exercise24_07: Animation: linked list");
        mainStage.show();
    }
    public Pane controller(){
        Label[]lbl = new Label[2];
        lbl[0] = new Label("Enter a value:");
        lbl[1] = new Label("Enter an index:");
        for (Label label : lbl) label.setFont(Font.font("Book Antiqua", 14));

        Button[]btn = new Button[3];
        btn[0] = new Button("Search");
        btn[1] = new Button("Insert");
        btn[2] = new Button("Delete");
        for (Button button : btn) {
            button.setFont(Font.font("Book Antiqua", 14));
            button.setStyle("-fx-background-color: #3070A8FF; -fx-text-fill: white");

        }
        TextField value = new TextField();
        TextField index = new TextField();

        HBox root = new HBox(5, lbl[0], value, lbl[1], index, btn[0], btn[1], btn[2]);
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
        return root;

    }
    public void current(){
        grid.getChildren().clear();
        Label[]labels = {new Label("head"), new Label("tail")};
        if(list.isEmpty()){
            displayByDefault();
        }
        else if(list.size() == 1){
            HBox headTail = new HBox(10, labels);
            grid.add(headTail, 0, 0);
            grid.add(rec(), 0, 1);
            grid.add(new Label(list.getFirst()), 0, 2);
        }
        else{
            for(int i = 0; i < list.size(); i++){
                if(i == 0)
                    grid.add(labels[0], 0, 0);
                else if(i == list.size() - 1)
                    grid.add(labels[1], i, 0);

                grid.add(rec(), i, 1);
                grid.add(new Label(list.get(i)), i, 2);
            }
        }
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
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setPrefHeight(150);
        grid.add(new Label("head: null"), 0, 0);
        grid.add(new Label("tail: null"), 0, 1);
    }
    public Shape rec(){
        Rectangle rec = new Rectangle(50, 25, Color.WHITE);
        rec.setStroke(Color.BLACK);
        return rec;
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
