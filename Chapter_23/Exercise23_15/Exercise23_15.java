/*
(Selection-sort animation) Write a program that animates the selection sort algorithm.
Create an array that consists of 25 distinct numbers from 1 to 25 in a random
order. The array elements are displayed in a histogram, as shown in Figure 23.20a.
Clicking the Step button causes the program to perform an iteration of the outer
loop in the algorithm and repaints the histogram for the new array. Color the last
bar in the sorted subarray. When the algorithm is finished, display a message to
inform the user. Clicking the Reset button creates a new random array for a new
start. (You can easily modify the program to animate the insertion algorithm.)
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

public class Exercise23_15 extends Application {
    HBox root = new HBox();
    VBox vBox = new VBox();
    HBox controller = new HBox(10);
    int[]arr;
    Rectangle[]rec;

    Label message = new Label();

    //for sorting
    int i, j = i + 1, minIndex = i, min;

    @Override
    public void start(Stage primaryStage) {

        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPrefSize(400, 175);
        arr = shuffle(25, 25);

        Button step = new Button("step");
        Button reset = new Button("Reset");
        controller.getChildren().addAll(message, step, reset);
        controller.setAlignment(Pos.BOTTOM_CENTER);

        vBox.getChildren().addAll(root, controller);
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Exercise23_15: Selection Sort");
        primaryStage.setResizable(false);
        primaryStage.show();


        reset.setOnAction(e -> {
            arr = shuffle(25, 25);
            i = 0;
            j = i + 1;
            minIndex = i;
            min = arr[minIndex];
            message.setText("");
        });

        min = arr[minIndex];
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
                    if(j < arr.length){
                        defaultValue();
                        rec[j].setStyle("-fx-fill:red; -fx-stroke: black");
                        if(min > arr[j]) {
                            minIndex = j;
                            min = arr[j];
                        }
                        j++;
                    }
                    else{
                        if(minIndex != i){
                            VBox vBox = new VBox(10, new Label(arr[minIndex] + ""), rec[minIndex]);
                            VBox vBox1 = new VBox(10, new Label(arr[i] + ""), rec[i]);
                            vBox.setAlignment(Pos.BOTTOM_CENTER);
                            vBox1.setAlignment(Pos.BOTTOM_CENTER);

                            Rectangle temp = rec[minIndex];
                            rec[minIndex] = rec[i];
                            rec[i] = temp;


                            root.getChildren().set(i, vBox);
                            root.getChildren().set(minIndex, vBox1);

                            arr[minIndex] = arr[i];
                            arr[i] = min;
                        }
                        j = 0;
                        i = (i + 1 < arr.length) ? i + 1:i;
                        j = i + 1;

                        minIndex = i;
                        min = arr[i];
                    }
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
