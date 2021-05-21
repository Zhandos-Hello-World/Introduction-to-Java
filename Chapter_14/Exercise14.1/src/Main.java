import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Image British = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1200px-Flag_of_the_United_Kingdom.svg.png");
    private Image Canada = new Image("https://dynamicmedia.zuza.com/zz/m/original_/9/4/94747413-5e9e-45f1-a73e-f5a42936126d/LIST_FlagfactsFeb15_Gallery.jpg");
    private Image China = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1200px-Flag_of_the_People%27s_Republic_of_China.svg.png");
    private Image USA = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png");
    @Override
    public void start(Stage stage) {
        GridPane flagsGrid = new GridPane();
        ImageView[]flags = {new ImageView(British), new ImageView(Canada), new ImageView(China), new ImageView(USA)};
        for(ImageView value:flags){
            value.setFitHeight(100);
            value.setFitWidth(200);
        }
        flagsGrid.add(flags[0], 0, 0);
        flagsGrid.add(flags[1], 1, 0);
        flagsGrid.add(flags[2], 0, 1);
        flagsGrid.add(flags[3], 1, 1);
        flagsGrid.setPadding(new Insets(10, 10, 10, 10));
        stage.setScene(new Scene(flagsGrid));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[]args){
        launch(args);
    }
}
