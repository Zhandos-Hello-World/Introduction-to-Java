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


/*
(Animation: array list in slow motion) Improve the animation in the preceding
programming exercise by showing the insertion and deletion operations in a slow
motion.
*/
public class Exercise24_09 extends Application {
    final static MyArrayList<String> list = new MyArrayList<>();
    Stage mainStage;
    HBox line = new HBox();
    Label titleWord = new Label("Usage: Enter a value and click the Search, Insert, and Delete button to search, insert, or delete the value from the list. Enter a value and an index and then click the Insert button to insert the value in the specified index. Enter an index and then click the Delete button to delete the value in the specified index. Click the TrimToSize button to make the capacity the same as the size.");
    Label information = new Label();


    @Override
    public void start(Stage stage) {
        line.setPadding(new Insets(0, 10, 0, 10));

        displayByDefault();
        titleWord.setWrapText(true);
        titleWord.setPadding(new Insets(10, 10, 10, 10));

        VBox root = new VBox(titleWord, information, line, controller());

        mainStage = stage;
        mainStage.setScene(new Scene(root, 800, 270));
        mainStage.setResizable(false);
        mainStage.setTitle("Exercise24_09: Animation: array list");
        mainStage.show();
    }
    public Pane controller(){
        Label[]lbl = new Label[2];
        lbl[0] = new Label("Enter a value:");
        lbl[1] = new Label("Enter an index:");
        for (Label label : lbl) label.setFont(Font.font("Book Antiqua", 14));

        Button[]btn = new Button[4];
        btn[0] = new Button("Search");
        btn[1] = new Button("Insert");
        btn[2] = new Button("Delete");
        btn[3] = new Button("TrimToSize");
        for (Button button : btn) {
            button.setFont(Font.font("Book Antiqua", 14));
            button.setStyle("-fx-background-color: #3070A8FF; -fx-text-fill: white");

        }
        TextField value = new TextField();
        TextField index = new TextField();

        HBox root = new HBox(5, lbl[0], value, lbl[1], index, btn[0], btn[1], btn[2], btn[3]);
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
            list.trimToSize();
            current();
        });


        return root;

    }
    public void current(){
        line.getChildren().clear();
        if(list.isEmpty()){
            displayByDefault();
        }
        else{
            for(int i = 0; i < list.sizeWithNull(); i++){
                if(i < list.size())
                    line.getChildren().add(rec(list.get(i)));
                else
                    line.getChildren().add(recByDefault());
            }
        }
        currentInformation();
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
        line.getChildren().clear();
        line.setPrefHeight(150);
        for(int i = 0; i < list.sizeWithNull(); i++){
            line.getChildren().add(recByDefault());
        }
        currentInformation();
    }
    public void currentInformation(){
        String value = "array list is" + ((list.isEmpty()) ? "":" not") + " empty size = " + list.size() + " and capacity is " + list.sizeWithNull();
        information.setText(value);
        information.setPadding(new Insets(10, 10, 10, 10));
    }



    public Pane recByDefault(){
        Rectangle rec = new Rectangle(50, 25, Color.WHITE);
        rec.setStroke(Color.BLACK);

        Line line = new Line(0, 0, rec.getX() + 50, rec.getY() + 25);

        return new StackPane(rec, line);
    }


    public StackPane rec(String value){
        StackPane stackPane = new StackPane();
        Rectangle rec = new Rectangle(50, 25, Color.WHITE);
        rec.setStroke(Color.BLACK);

        Label label = new Label(value);

        stackPane.getChildren().addAll(rec, label);
        return stackPane;
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
