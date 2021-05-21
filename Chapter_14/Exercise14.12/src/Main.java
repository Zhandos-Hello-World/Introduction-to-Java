/*
(Display a bar chart) Write a program that uses a bar chart to display the percentages of the overall market share represented by Apple, HTC, Samsung, and
Others, as shown in Figure 14.46b. Suppose that Apple takes 20 percent and is
displayed in red, HTC takes 26 percent and is displayed in blue, Samsung takes
28 percent and is displayed in green, and the Others take 26 and are displayed
in orange. Use the Rectangle class to display the bars. Interested readers may
explore the JavaFX BarChart class for further study.
 */

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;



public class Main extends Application {
    public static final int pixel = 3;
    @Override
    public void start(Stage primaryStage){
        FlowPane root = new FlowPane();
        int []percents = {20, 26, 28, 26};
        String []companies = {"Apple", "HTC", "Samsung", "Others"};
        Color[]colorsOfTheRectangles = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
        for(int i = 0; i < percents.length; i++){
            root.getChildren().add(getStatistic(percents[i], companies[i], colorsOfTheRectangles[i]));
        }
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setHgap(5);
        root.setVgap(5);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public VBox getStatistic(int percent, String nameOfTheCompany, Color colorOfTheRectangle){
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle rectangle = new Rectangle(100, pixel * percent, colorOfTheRectangle);
        vbox.getChildren().addAll(new Label(nameOfTheCompany + " -- " + percent), rectangle);
        return vbox;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
