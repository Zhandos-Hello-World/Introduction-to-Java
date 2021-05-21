/*
(Remove the largest ball first) Modify Listing 20.10, MultipleBallApp
.java to assign a random radius between 2 and 20 when a ball is created.
When the - button is clicked, one of largest balls is removed.
 */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;


public class Main extends Application {
    PriorityQueue<Ball> queue = new PriorityQueue<>(new Comparator<Ball>() {
        @Override
        public int compare(Ball o1, Ball o2) {
            if(o1.getRadius() > o2.getRadius()){
                return 1;
            }
            else if(o1.getRadius() < o2.getRadius()){
                return -1;
            }
            return 0;
        }
    });
    LinkedList<Ball> list = new LinkedList<>();
    @Override
    public void start(Stage primaryStage) {

        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("−fx−border−color: yellow");

        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10, btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e->ballPane.add());
        btSubtract.setOnAction(e->ballPane.subtract());

        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e->ballPane.play());

        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("MultipleBounceBall");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[]args){
        launch(args);
    }
    private class MultipleBallPane extends Pane{

        private Timeline animation;
        public MultipleBallPane(){
            animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }
        public void add(){
            Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
            Ball tempBall = new Ball(30, 30, (int)(Math.random() * 21 + 2), color);
            list.addLast(tempBall);
            getChildren().add(list.getLast());

        }
        public void subtract(){
            if(getChildren().size() > 0){
                PriorityQueue<Ball> queue = new PriorityQueue<>(list);
                queue.poll();
                getChildren().remove(list.getLast());
                list.removeLast();
            }
        }
        public void play(){
            animation.play();
        }
        public void pause(){
            animation.pause();
        }
        public void increaseSpeed(){
            animation.setRate(animation.getRate() + 0.1);
        }
        public void decreaseSpeed(){
            animation.setRate(animation.getRate() - 0.1);
        }
        public DoubleProperty rateProperty(){
            return animation.rateProperty();
        }

        protected void moveBall(){
            for(Node node:this.getChildren()){
                Ball ball = (Ball)node;
                if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
                    ball.dx *= - 1; // Change ball move direction
                }
                if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
                    ball.dy *= - 1; // Change ball move direction
                }
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());
            }
        }
    }

}
class Ball extends Circle{
    public double dx = 1, dy =1;

    Ball(double dx, double dy, double radius, Color color){
        super(dx, dy, radius);
        setFill(color);
    }
}