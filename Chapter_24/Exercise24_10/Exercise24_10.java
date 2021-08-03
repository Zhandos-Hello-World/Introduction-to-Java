import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
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
(Animation: stack) Write a program to animate push and pop in a stack, as shown
in Figure 24.20a.
*/
public class Exercise24_10 extends Application {
    final static GenericStack<String> stack = new GenericStack<>();
    
    GridPane grid = new GridPane();
    Label titleWord = new Label("Usage: Enter a value and click the Push button to push the value into the stack. Click the Pop button to remove the top element from the stack.");


    @Override
    public void start(Stage stage) {
        grid.setPadding(new Insets(0, 10, 0, 10));
        grid.setPrefHeight(200);
        grid.setNodeOrientation(NodeOrientation.INHERIT);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);

        displayByDefault();
        titleWord.setWrapText(true);
        titleWord.setPadding(new Insets(10, 10, 10, 10));

        VBox root = new VBox(titleWord, grid, controller());

        
        stage.setScene(new Scene(root, 700, 350));
        stage.setResizable(false);
        stage.setTitle("Exercise24_10: Animation: stack");
        stage.show();
    }
    public Pane controller(){
        Label label = new Label("Enter a value:");
        label.setFont(Font.font("Book Antiqua", 14));


        Button[]btn = new Button[3];
        btn[0] = new Button("Push");
        btn[1] = new Button("Pop");
        btn[2] = new Button("Peek");
        for (Button button : btn) {
            button.setFont(Font.font("Book Antiqua", 14));
            button.setStyle("-fx-background-color: #3070A8FF; -fx-text-fill: white");

        }
        TextField value = new TextField();

        HBox root = new HBox(5, label, value, btn[0], btn[1], btn[2]);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPadding(new Insets(0, 0, 10, 0));


        btn[0].setOnAction(e -> {
            if(value.getText().trim().length() == 0)
                message("no value entered");
            else{
                stack.push(value.getText());
                current();
            }
        });
        btn[1].setOnAction(e -> {
            if(stack.isEmpty())
                message("The stack is empty");
            else{
                stack.pop();
                current();
            }
        });
        btn[2].setOnAction(e -> {
            if(stack.isEmpty())
                message("The stack is empty");
            else{
                message("The top element is " + stack.peek());
            }
        });

        return root;

    }

    public void current(){
        grid.getChildren().clear();
        if(stack.isEmpty()){
            displayByDefault();
        }
        else{
            int i = stack.getSize();
            for(String value:stack.getList()){
                grid.add(rec(value), 0, i);
                i--;
            }
            grid.add(getSymbol(), 1, i + 1);
            grid.add(new Label("Top"), 2,  i + 1);
        }
    }
    public Pane getSymbol(){
        Pane pane = new Pane();
        pane.setPrefSize(50, 25);
        Line line = new Line();
        line.setStartX(0);
        line.startYProperty().bind(pane.heightProperty().divide(2));
        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty().divide(2));


        Line line1 = new Line(0, 12.5, 25, 0);
        Line line2 = new Line(0, 12.5, 25, 25);


        pane.getChildren().addAll(line, line1, line2);
        return pane;
    }



    public void displayByDefault(){
        grid.getChildren().clear();
        grid.getChildren().add(new Label("stack is empty"));
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
