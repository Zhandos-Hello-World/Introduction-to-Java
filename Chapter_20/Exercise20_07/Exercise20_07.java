/*
(Game: hangman) Programming Exercise 7.35 presents a console version of
the popular hangman game. Write a GUI program that lets a user play the
game. The user guesses a word by entering one letter at a time, as shown in
Figure 20.18. If the user misses seven times, a hanging man swings. Once
a  word is finished, the user can press the Enter key to continue to guess
another word.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.LinkedList;

public class Exercise20_07 extends Application {
    private static final LinkedList<String> list = new LinkedList<>(Arrays.asList("write", "that", "hello", "love", "goals", "read", "live"));
    private static int step = 0;
    private boolean emptyMissedWord = true;
    private boolean stepWin = false;
    private int chance = 0;
    private static StringBuilder word = new StringBuilder("");
    private static StringBuilder missed = new StringBuilder("Missed letters: ");
    private Label guessWord = new Label(word.toString());
    private Label missedDisplay = new Label();
    @Override
    public void start(Stage stage) {
        newWord();
        VBox h = new VBox(10, guessWord, missedDisplay);
        h.setAlignment(Pos.BOTTOM_CENTER);
        Game game = new Game();
        stage.setWidth(400);
        stage.setHeight(400);
        Scene scene = new Scene(new VBox(game, h));
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(keyEvent -> {
            if(keyEvent.getCode() == KeyCode.ENTER && word.toString().equals(list.get(step - 1))){
                newWord();
                guessWord("");
            }

            if(list.get(step - 1).contains(keyEvent.getText()) && !word.toString().contains(keyEvent.getText()) && !stepWin &&
                    keyEvent.getText().toLowerCase().charAt(0) >= 'a' &&
                    keyEvent.getText().toLowerCase().charAt(0) <= 'z'){
                word = new StringBuilder(exchange(list.get(step - 1), word.toString(), keyEvent.getText().charAt(0)));
                guessWord.setText(word.toString());
                if(word.toString().equals(list.get(step - 1))){
                    missedDisplay.setText("To continue the game, press ENTER");
                    stepWin = true;
                }
            }
            else if(!list.get(step - 1).contains(keyEvent.getText()) && !stepWin &&
                    keyEvent.getText().toLowerCase().charAt(0) >= 'a' &&
                     keyEvent.getText().toLowerCase().charAt(0) <= 'z'){
                guessWord(keyEvent.getText());
                game.next();
                chance++;
            }
        });

    }
    public void newWord(){
        stepWin = false;
        word = new StringBuilder();
        for(int i = 0; i < list.get(step).length(); i++){
            word.append("*");
        }
        guessWord.setText("Guess a word: " + word);
        step++;
    }
    public void guessWord(String text){
        if(text.equals("") && emptyMissedWord){
            missedDisplay.setText("");
        }
        else if(emptyMissedWord){
            missed.append(text);
            missedDisplay.setText(missed.toString());
            emptyMissedWord = false;
        }
        else{
            missed.append(text);
            missedDisplay.setText(missed.toString());
        }
    }


    private static class Game extends Pane {
        private Group body = new Group();
        private int step = 0;

        public Game(){
            Circle circle = new Circle();
            circle.radiusProperty().bind(heightProperty().divide(20).add(widthProperty().divide(20)));
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            circle.centerXProperty().bind(widthProperty().divide(4));
            circle.centerYProperty().bind(heightProperty());

            Line line = new Line();
            line.startXProperty().bind(widthProperty().divide(4));
            line.endXProperty().bind(widthProperty().divide(4));
            line.startYProperty().bind(heightProperty().subtract(circle.getRadius()));
            line.endYProperty().bind(heightProperty().divide(4));

            Line line1 = new Line();
            line1.startXProperty().bind(widthProperty().divide(4));
            line1.endXProperty().bind(widthProperty().divide(1.8));
            line1.startYProperty().bind(heightProperty().divide(4));
            line1.endYProperty().bind(heightProperty().divide(4));


            Group group = new Group(line, circle, line1, body);
            this.getChildren().addAll(group);
            next();
        }

        public void next(){
            switch (step){
                case 0:thread();break;
                case 1:head();break;
                case 2:leftHand();break;
                case 3:rightHand();break;
                case 4:body();break;
                case 5:leftLeg();break;
                case 6:rightLeg();break;
            }
            step+=1;
        }
        public void thread(){
            Line line = new Line();
            line.startXProperty().bind(widthProperty().divide(1.8));
            line.endXProperty().bind(widthProperty().divide(1.8));
            line.startYProperty().bind(heightProperty().divide(4));
            line.endYProperty().bind(heightProperty().divide(3));
            body.getChildren().add(line);
        }



        public void head(){
            Circle head = new Circle();
            head.radiusProperty().bind(heightProperty().divide(40).add(widthProperty().divide(40)));
            head.centerYProperty().bind(heightProperty().divide(3).add(heightProperty().divide(40).add(widthProperty().divide(40))));
            head.centerXProperty().bind(widthProperty().divide(1.8));
            head.setFill(Color.WHITE);
            head.setStroke(Color.BLACK);
            body.getChildren().add(head);
        }
        public void body(){
            Line b = new Line();
            b.startXProperty().bind(widthProperty().divide(1.8));
            b.endXProperty().bind(widthProperty().divide(1.8));
            b.startYProperty().bind(heightProperty().divide(3).add((heightProperty().divide(40).add(widthProperty().divide(40))).multiply(2)));
            b.endYProperty().bind(heightProperty().divide(1.65));
            body.getChildren().add(b);
        }
        public void rightHand(){
            Line hand = new Line();
            hand.startXProperty().bind(widthProperty().divide(1.8));
            hand.endXProperty().bind(widthProperty().divide(1.6));
            hand.startYProperty().bind(heightProperty().divide(3).add((heightProperty().divide(40).add(widthProperty().divide(40))).multiply(2)));
            hand.endYProperty().bind(heightProperty().divide(1.8));
            body.getChildren().add(hand);
        }
        public void leftHand(){
            Line hand = new Line();
            hand.startXProperty().bind(widthProperty().divide(1.8));
            hand.endXProperty().bind(widthProperty().divide(2));
            hand.startYProperty().bind(heightProperty().divide(3).add((heightProperty().divide(40).add(widthProperty().divide(40))).multiply(2)));
            hand.endYProperty().bind(heightProperty().divide(1.8));
            body.getChildren().add(hand);
        }
        public void rightLeg(){
            Line leg = new Line();
            leg.startXProperty().bind(widthProperty().divide(1.8));
            leg.endXProperty().bind(widthProperty().divide(1.6));
            leg.startYProperty().bind(heightProperty().divide(1.65));
            leg.endYProperty().bind(heightProperty().divide(1.4));
            body.getChildren().add(leg);
        }
        public void leftLeg(){
            Line leg = new Line();
            leg.startXProperty().bind(widthProperty().divide(1.8));
            leg.endXProperty().bind(widthProperty().divide(2));
            leg.startYProperty().bind(heightProperty().divide(1.65));
            leg.endYProperty().bind(heightProperty().divide(1.4));
            body.getChildren().add(leg);
        }
    }
    public static void main(String[]args){
        launch(args);
    }
    public static String exchange(String word, String current, char c){
        char[]list = current.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == c){
                list[i] = c;
            }
        }
        String result = "";
        for(char value:list){
            result += String.valueOf(value);
        }
        return result;
    }
}