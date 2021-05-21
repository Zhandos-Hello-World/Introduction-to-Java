/*
(Display a SLOW sign) Write a program that displays a SLOW sign, as shown in
Figure 14.47b. The octagon is in red and the sign is in white. (Hint: Place an
octagon and a text in a stack pane.)
*/







import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        StackPane stackPane = new StackPane();
        Label label = new Label("STOP");
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Times New Roman", FontWeight.BLACK, FontPosture.REGULAR, 30));
        stackPane.getChildren().addAll(getShape(), label);
        Scene scene = new Scene(stackPane, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
    public Group getShape(){
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{300.0, 70.0,
                240.0, 30.0,
                180.0, 30.0,
                120.0, 70.0,
                120.0, 140.0,
                180.0, 180.0,
                240.0, 180.0,
                300.0, 140.0});
        Group root = new Group(polygon);
        polygon.setFill(Color.RED);
        root.setStyle("-fx-background-color: red");
        return root;
    }
    public static void main(String... args){
        launch(args);
    }
}