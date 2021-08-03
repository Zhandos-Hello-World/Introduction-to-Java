/*
(Radix-sort animation) Write a program that animates the radix sort algorithm. Create an array that consists of 20 random numbers from 0 to 800. The array elements
are displayed, as shown in Figure 23.21. Clicking the Step button causes the program
to place a number in a bucket. The number that has just been placed is displayed in
red. Once all the numbers are placed in the buckets, clicking the Step button collects all the numbers from the buckets and moves them back to the array. When the
algorithm is finished, clicking the Step button displays a message to inform the user.
Clicking the Reset button creates a new random array for a new start.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Stack;


public class Exercise23_17 extends Application {
    HBox bucketRoot = new HBox(10);
    ListView[]buckets = new ListView[10];
    Stack<Integer>[] stack = new Stack[10];

    HBox showArray = new HBox();
    Label[]arrayDisplay;
    HBox controller = new HBox(10);
    int[]arr;

    int pastIndex[] = new int[2];

    Label message = new Label();

    //for sorting
    int i = 0, divide = 1, divideByPercent = 10;
    int iteration, maxIteration;

    @Override
    public void start(Stage primaryStage) {

        arr = shuffle(20, 800);
        System.out.println(maxIteration);
        Button step = new Button("step");
        Button reset = new Button("Reset");
        controller.getChildren().addAll(message, step, reset);
        controller.setAlignment(Pos.BOTTOM_CENTER);


        StringBuilder text = new StringBuilder();
        for(int i = 0; i <= 9; i++){
            text.append("bucket["+i+"]");
        }
        Label label = new Label(text.toString());
        label.setFont(Font.font(20));

        VBox vBox = new VBox(showArray, bucketRoot, label, controller);
        vBox.setPrefSize(650, 270);
        vBox.setAlignment(Pos.BOTTOM_CENTER);

        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Exercise23_17: Radix Sort");

        primaryStage.show();


        reset.setOnAction(e -> {
            arr = shuffle(20, 800);
            message.setText("");
            iteration = 0;
            maxIteration = 0;
        });

        step.setOnAction(e -> {
            if(iteration == maxIteration){
                message.setText("The array is sorted!!!");
            }
            else{
                if (i < arr.length) {
                    if (i - 1 >= 0)
                        arrayDisplay[i - 1].setTextFill(Color.BLACK);
                    else
                        arrayDisplay[arrayDisplay.length - 1].setTextFill(Color.BLACK);
                    arrayDisplay[i].setTextFill(Color.RED);
                    int indexBucket = Integer.parseInt(arrayDisplay[i].getText()) / divide % divideByPercent;
                    Label label1 = new Label(arrayDisplay[i].getText());
                    label1.setTextFill(Color.RED);
                    if(pastIndex[1] <= buckets[pastIndex[0]].getItems().size() && buckets[pastIndex[0]].getItems().size() != 0){
                        ((Label)buckets[pastIndex[0]].getItems().get(pastIndex[1])).setTextFill(Color.BLACK);
                    }

                    buckets[indexBucket].getItems().add(label1);
                    pastIndex = new int[]{indexBucket, buckets[indexBucket].getItems().size() - 1};
                    stack[indexBucket].push(Integer.parseInt(arrayDisplay[i].getText()));
                    i++;
                } else {
                    iteration++;
                    insertionSort();
                    i = 0;
                    divide *= 10;
                    int index = 0;
                    for(int i = 0; i < arrayDisplay.length; i++){
                        while(stack[index].isEmpty()){
                            index++;
                        }
                        int num = stack[index].pop();
                        arrayDisplay[i].setText(num + "");
                        arr[i] = num;
                        if(i < 10)
                            buckets[i].getItems().clear();
                    }

                }
            }
        });
    }


    public void insertionSort(){
        for(int i = 0; i < stack.length; i++){
            if(!stack[i].isEmpty()){
                int[]arr = new int[stack[i].size()];
                for(int j = 0;!stack[i].isEmpty(); j++){
                    arr[j] = stack[i].pop();
                }
                for(int j = 1; j < arr.length; j++){
                    int k;
                    int currentElement = arr[j];
                    for(k = j - 1; k >= 0 && currentElement > arr[k]; k--){
                        arr[k + 1] = arr[k];
                    }
                    arr[k + 1] = currentElement;
                }
                stack[i] = new Stack<>();
                for(int value:arr){
                    stack[i].push(value);
                }
            }
        }
    }




    public int[] shuffle(int size, int length){
        showArray.getChildren().clear();
        bucketRoot.getChildren().clear();

        int[]temp = new int[size];
        arrayDisplay = new Label[size];
        StackPane[]stack = new StackPane[size];
        int max = 0;
        for(int i = 0; i < size; i++){
            temp[i] = (int)(Math.random() * (length + 1) + 0);
            arrayDisplay[i] = new Label(temp[i] + "");
            Rectangle rectangle = new Rectangle(40, 30);
            rectangle.setStyle("-fx-fill: white; -fx-stroke: black");
            stack[i] = new StackPane(rectangle, arrayDisplay[i]);
            if(max < temp[i])
                max = temp[i];
        }
        while (max / 10 != 0){
            maxIteration++;
            System.out.println(maxIteration);
            max /= 10;
        }
        maxIteration++;


        showArray.getChildren().addAll(stack);
        showArray.setAlignment(Pos.BOTTOM_CENTER);
        showArray.setPadding(new Insets(20, 10, 10, 20));


        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ListView();
            this.stack[i] = new Stack<>();
        }
        bucketRoot.setPadding(new Insets(0, 20, 0, 20));
        bucketRoot.getChildren().addAll(buckets);

        return temp;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
