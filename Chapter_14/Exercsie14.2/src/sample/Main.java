package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Image image = new Image("https://media.tenor.com/images/07b376ae0c1490c4b35a576fc431abae/tenor.gif");
        ImageView imageView = new ImageView(image);
        Pane pane = new Pane();
        pane.getChildren().add(imageView);
        Scene scene = new Scene(pane);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_02");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
