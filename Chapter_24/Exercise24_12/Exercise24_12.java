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
(Animation: queue) Write a program to animate the enqueue and dequeue
operations on a queue, as shown in Figure 24.20b.
*/
public class Exercise24_12 extends Application {
    final static LinkedList<String> list = new LinkedList<>();
    Stage mainStage;
    GridPane grid = new GridPane();
    Label titleWord = new Label("Usage: Enter a value and click the Enqueue button to append the value into the tail of the queue. Click the Dequeue button to remove the element from the head of the queue. Click the Start Over button to start over.");

    @Override
    public void start(Stage stage) {
        displayByDefault();
        titleWord.setWrapText(true);
        titleWord.setPadding(new Insets(10, 10, 10, 10));

        VBox root = new VBox(titleWord, grid, controller());

        mainStage = stage;
        mainStage.setScene(new Scene(root, 700, 270));
        mainStage.setResizable(false);
        mainStage.setTitle("Exercise24_12: Queue Animation");
        mainStage.show();
    }
    public Pane controller(){
        Label[]lbl = new Label[2];
        lbl[0] = new Label("Enter a value:");
        lbl[1] = new Label("Enter an index:");
        for (Label label : lbl) label.setFont(Font.font("Book Antiqua", 14));

        Button[]btn = new Button[3];
        btn[0] = new Button("Enqueue");
        btn[1] = new Button("Dequeue");
        btn[2] = new Button("Start Over");
        for (Button button : btn) {
            button.setFont(Font.font("Book Antiqua", 14));
            button.setStyle("-fx-background-color: #3070A8FF; -fx-text-fill: white");

        }
        TextField value = new TextField();


        HBox root = new HBox(5, lbl[0], value, lbl[1], btn[0], btn[1], btn[2]);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPadding(new Insets(0, 0, 10, 0));


        btn[0].setOnAction(e -> {
            if(value.getText().trim().length() != 0){
                list.addLast(value.getText());
                current();
            }
            else
                message("no value entered");

        });
        btn[1].setOnAction(e -> {
            if(!list.isEmpty()){
                list.removeFirst();
                current();
            }
            else
                message("The queue is empty");
        });
        btn[2].setOnAction(e -> {
            list.clear();
            current();
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

    public void displayByDefault(){
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setPrefHeight(150);
        grid.add(new Label("queue is empty"), 0, 0);

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
