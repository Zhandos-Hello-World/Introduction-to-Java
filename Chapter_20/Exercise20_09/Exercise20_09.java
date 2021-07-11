/*
(Remove the largest ball first) Modify Listing 20.09, MultipleBallApp
.java to assign a random radius between 2 and 20 when a ball is created.
When the - button is clicked, one of largest balls is removed.
*/

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import java.util.*;

public class Exercise20_09 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color: yellow");

        // Create four buttons
        Button btSuspend = new Button("Suspend");
        Button btResume = new Button("Resume");
        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(
                btSuspend, btResume, btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // Add or remove a ball
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());
        ballPane.setOnMousePressed(e -> {
            for (Node node: ballPane.getChildren()) {
                Ball ball = (Ball)node;
                if (ball.contains(e.getX(), e.getY())) {
                    ballPane.getChildren().remove(ball);
                }
            }
        });

        // Pause and resume animation
        btSuspend.setOnAction(e -> ballPane.pause());
        btResume.setOnAction(e -> ballPane.play());

        // Use a scroll bar to control animation speed
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        // Create a border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        // Create a scene and place the in the stage
        Scene scene = new Scene(pane, 350, 200);
        primaryStage.setTitle("Exercise_20_05"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private class MultipleBallPane extends Pane {
        private Timeline animation;

        public MultipleBallPane() {
            // Create an animation for moving the ball
            animation = new Timeline(
                    new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play(); // Start animation
        }

        public void add() {
            Color color = new Color(Math.random(),
                    Math.random(), Math.random(), 0.5);
            getChildren().add(new Ball(30, 30, Math.random() * 22 + 2, color));
        }

        public void subtract() {
            if (getChildren().size() > 0) {
                ArrayList<Ball> balls = new ArrayList<>();
                for(int i = 0; i < getChildren().size(); i++){
                    if(getChildren().get(i) instanceof Ball){
                        balls.add((Ball)getChildren().get(i));
                    }
                }
                Ball large = Collections.max(balls);
                getChildren().remove(large);
            }
        }

        public void play() {
            animation.play();
        }

        public void pause() {
            animation.pause();
        }

        public void increaseSpeed() {
            animation.setRate(animation.getRate() + 0.1);
        }

        public void decreaseSpeed() {
            animation.setRate(
                    animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

        public DoubleProperty rateProperty() {
            return animation.rateProperty();
        }

        protected void moveBall() {
            for (Node node: this.getChildren()) {
                Ball ball = (Ball)node;
                // Check boundaries
                if (ball.getCenterX() < ball.getRadius() ||
                        ball.getCenterX() > getWidth() - ball.getRadius()) {
                    ball.dx *= -1; // Change ball move direction
                }
                if (ball.getCenterY() < ball.getRadius() ||
                        ball.getCenterY() > getHeight() - ball.getRadius()) {
                    ball.dy *= -1; // Change ball move direction
                }

                // Adjust ball position
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());

                // Check if balls collide
                ArrayList<Node> list = new ArrayList<>(this.getChildren());
                for (int i = getChildren().indexOf(node) + 1;
                     i < list.size(); i++) {
                    Ball nextBall = (Ball)list.get(i);
                    if (intersects(ball, nextBall)) {
                        // Remove the later ball that was added to
                        // pane and add its radius to the other ball
                        ball.setRadius(ball.getRadius() +
                                nextBall.getRadius());
                        getChildren().remove(nextBall);
                    }
                }
            }
        }

        /** Returns true if circles inIntersect */
        private boolean intersects(Ball ball, Ball nextBall) {
            return Math.sqrt(Math.pow(ball.getCenterX() - nextBall.getCenterX(), 2) +
                    Math.pow(ball.getCenterY() - nextBall.getCenterY(), 2))
                    <= ball.getRadius() + nextBall.getRadius();
        }
    }

    class Ball extends Circle implements Comparable<Ball> {
        private double dx = 1, dy = 1;

        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color); // Set ball color
        }

        @Override
        public int compareTo(Ball o) {
            if(getRadius() > o.getRadius()){
                return 1;
            }
            else if(getRadius() < o.getRadius()){
                return -1;
            }
            return 0;
        }
    }
}