/*
(Combine files GUI) Rewrite Exercise 17.12 with a GUI, as shown in Figure 17.21b.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Main extends Application {
    private static final Label title = new Label("If the base file is named temp.txt with three pieces, temp.txt.1, temp.txt.2, and temp.txt.3 are combined into temp.txt");
    private static final Label word1 = new Label("Enter a file: ");
    private static final Label word2 = new Label("Specify the number of smaller files:");
    private static final TextField[]textFields = {new TextField(), new TextField()};
    private static final Button start = new Button("Start");

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.add(word1, 0, 0);
        gridPane.add(textFields[0], 1, 0);
        gridPane.add(word2, 0, 1);
        gridPane.add(textFields[1], 1, 1);
        title.setWrapText(true);
        VBox vBox = new VBox(10, title, gridPane, start);
        vBox.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(vBox, 430, 160));
        stage.setTitle("Exercise17_03");
        stage.show();


        start.setOnAction(E -> {
            try{
                File file;
                int sumFiles = Integer.parseInt(textFields[1].getText());
                String nameOfTheFile = textFields[0].getText();
                RandomAccessFile targetFile = new RandomAccessFile(nameOfTheFile, "rw");
                nameOfTheFile = nameOfTheFile.substring(0, nameOfTheFile.length() - 4);
                for(int i = 1; i <= sumFiles; i++){
                    file = new File(nameOfTheFile.concat(String.valueOf(i).concat(".txt")));
                    if(file.exists()){
                        RandomAccessFile source = new RandomAccessFile(file, "rw");
                        byte []b = new byte[(int)source.length()];
                        source.seek(0);
                        source.read(b);
                        targetFile.seek(targetFile.length());
                        targetFile.write(b);
                        source.close();
                    }
                }
                targetFile.close();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        });

    }
    public static void main(String[]args){
        launch(args);
    }
}
