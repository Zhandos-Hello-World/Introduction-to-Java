import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    Image ticTacTae = new Image("https://media.tenor.com/images/07b376ae0c1490c4b35a576fc431abae/tenor.gif");
    public static void main(String[]args){
        launch(args);
    }
    public void start(Stage stage){
        stage.setScene(new Scene(new Pane(new ImageView(ticTacTae))));
        stage.show();
    }
}
