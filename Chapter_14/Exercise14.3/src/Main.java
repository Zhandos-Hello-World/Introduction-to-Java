/*
(Display three tiles) Write a program that displays three tiles randomly selected
from tiles of 32, as shown in Figure 14.43c. The Tien-Gow tiles image files are
named 1.png, 2.png, . . . , 32.png and stored in the image/tiengow directory.
All three tiles are distinct and selected randomly. Hint: You can select random
tiles by storing the numbers 1–32 to an array list, perform a random shuffle
introduced in Section 11.12, and use the first three numbers in the array list as
the file names for the image
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        int[][]arr = new int[6][6];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int randomlyNumber = (int)(Math.random() * 3 + 0);
                arr[i][j] = randomlyNumber;
                switch (arr[i][j]){
                    case 0: gridPane.add(new blackCircle(), j, i);break;
                    case 1: gridPane.add(new grayCircle(), j, i);break;
                    case 2: gridPane.add(new whiteCircle(), j, i); break;
                }
            }
        }
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(5,5,5,5));
        gridPane.setStyle("-fx-background-color: black");
        stage.setScene(new Scene(gridPane));
        stage.show();

    }
}


interface setting{
    int size = 20;
}
class whiteCircle extends Circle implements setting{
    whiteCircle(){
        super(size, new Color(1, 1, 1, 1));
    }
}
class grayCircle extends Circle implements setting{
    grayCircle(){
        super(size, new Color(.43,.43,.44, 1));
    }
}
class blackCircle extends Circle implements setting{
    blackCircle(){
        super(size, new Color(0, 0,0, 1));
    }
}
