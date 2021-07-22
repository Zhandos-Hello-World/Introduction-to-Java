/*
(Bubble-sort animation) Write a program that animates the bubble sort algorithm.
Create an array that consists of 25 distinct numbers from 1 to 25 in a
random order. The array elements are displayed in a histogram, as shown in
Figure 23.20b. Clicking the Step button causes the program to perform one
comparison in the algorithm and repaints the histogram for the new array.
Color the bar that represents the number being considered in the swap.
When the algorithm is finished, display a message to inform the user.
Clicking the Reset button creates a new random array for a new start.
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise23_16 extends Application {
    HBox root = new HBox();
    VBox vBox = new VBox();
    HBox controller = new HBox(10);
    int[]arr;
    Rectangle[]rec;

    Label message = new Label();

    //for sorting
    int i = 1;

    @Override
    public void start(Stage primaryStage) {

        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPrefSize(400, 200);
        arr = shuffle(25, 25);

        Button step = new Button("step");
        Button reset = new Button("Reset");
        controller.getChildren().addAll(message, step, reset);
        controller.setAlignment(Pos.BOTTOM_CENTER);

        vBox.getChildren().addAll(root, controller);
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Exercise23_16: Bubble Sort");
        primaryStage.setResizable(false);
        primaryStage.show();


        reset.setOnAction(e -> {
            arr = shuffle(25, 25);
            i = 1;
            message.setText("");
        });

        step.setOnAction(e -> {
            int num = arr[0];
            boolean sorted = true;
            for(int i:arr){
                if(num <= i){
                    num = i;
                }
                else{
                    sorted = false;
                    break;
                }
            }
            if(sorted){
                defaultValue();
                message.setText("The array is sorted!!!");
            }
            else{
                if(i < arr.length){
                    defaultValue();
                    rec[i].setStyle("-fx-fill: red; -fx-stroke: black");

                    if(arr[i - 1] > arr[i]){
                        VBox vBox = new VBox(10, new Label(arr[i - 1] + ""), rec[i - 1]);
                        VBox vBox1 = new VBox(10, new Label(arr[i] + ""), rec[i]);
                        vBox.setAlignment(Pos.BOTTOM_CENTER);
                        vBox1.setAlignment(Pos.BOTTOM_CENTER);


                        root.getChildren().set(i - 1, vBox1);
                        root.getChildren().set(i, vBox);


                        Rectangle temp = rec[i - 1];
                        rec[i - 1] = rec[i];
                        rec[i] = temp;


                        int tempNum = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = tempNum;

                    }
                    if(i + 1 == arr.length){
                        i = 0;
                    }
                    i++;
                }
            }

        });


    }
    public void defaultValue(){
        for (Rectangle rectangle : rec) {
            rectangle.setStyle("-fx-fill: white; -fx-stroke: black");
        }
    }




    public int[] shuffle(int size, int length){
        int[]temp = new int[size];
        int max = 0;
        for(int i = 0; i < size; i++){
            temp[i] = (int)(Math.random() * (length) + 1);
            if(max < temp[i])
                max = temp[i];
        }
        root.getChildren().clear();
        rec = new Rectangle[size];
        for(int i = 0; i < size; i++){
            rec[i] = new Rectangle();
            rec[i].setStyle("-fx-fill: white; -fx-stroke: black");
            rec[i].setHeight(temp[i] * 6.5);
            rec[i].setWidth(20);
            VBox platform = new VBox(10, new Label(temp[i] + ""), rec[i]);
            platform.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(platform);
        }
        return temp;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
