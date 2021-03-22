package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        ImageView imageView0 = new ImageView(new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/188px-Flag_of_the_United_Kingdom.svg.png"));
        ImageView imageView1 = new ImageView(new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/188px-Flag_of_the_United_States.svg.png"));
        ImageView imageView2 = new ImageView(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/188px-Flag_of_Canada_%28Pantone%29.svg.png"));
        ImageView imageView3 = new ImageView(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1280px-Flag_of_the_People%27s_Republic_of_China.svg.png"));
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        imageView0.setFitHeight(100);
        imageView0.setFitWidth(200);
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(200);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(200);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(200);
        gridPane.add(imageView0, 0, 0);
        gridPane.add(imageView1, 0, 1);
        gridPane.add(imageView2, 1,0);
        gridPane.add(imageView3, 1, 1);
        Scene scene = new Scene(gridPane, 415, 215);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}