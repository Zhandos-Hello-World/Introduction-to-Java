/*
(Game: the 24-point card game) Improve Programming Exercise 20.13
to enable the computer to display the expression if one exists, as shown in
Figure 20.19. Otherwise, report that the expression does not exist. Place the
label for verification result at the bottom of the UI. The expression must use all
four cards and evaluated to 24.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashSet;
import java.util.Stack;

public class Exercise20_15 extends Application {
    String path = "file:C:\\Users\\Zhandos\\Desktop\\Playing Cards\\PNG-cards-1.3\\";
    String []types = {"_of_clubs", "_of_diamonds", "_of_hearts", "_of_spades"};
    String []prime = {"jack", "queen", "king", "ace"};
    int[] numbers = new int[4];
    int start;

    HBox hBox2 = new HBox(10);
    @Override
    public void start(Stage stage)  {
        Button find = new Button("Find Solution");
        Button shuffle = new Button("Shuffle");
        TextField txt = new TextField();

        HBox hBox1 = new HBox(10, find, txt, shuffle);
        hBox1.setAlignment(Pos.TOP_RIGHT);

        shuffle();



        TextField txt1 = new TextField();
        Button verify = new Button("Verify");
        HBox hBox3 = new HBox(10, new Label("Enter an expression"), txt1, verify);
        hBox3.setAlignment(Pos.CENTER);

        Label message = new Label();


        stage.setScene(new Scene(new VBox(10, hBox1, hBox2, hBox3, message)));
        stage.setResizable(false);
        stage.show();



        shuffle.setOnAction(e -> shuffle());

        verify.setOnAction(e -> {
            if(calculate(postfixToInfix(txt1.getText())) == 24){
                message.setText("Correct result");
            }
        });

    }
    private void shuffle() {
        HashSet<String> avoidDuplicate = new HashSet<>();
        ImageView[]imageViews = new ImageView[4];
        int i = 0;
        while (i < 4) {
            int type = (int) (Math.random() * 4 + 0);
            int number = (int) (Math.random() * 12 + 0);
            String png;
            if (number < 9) {
                png = path +(number + 2) + types[type] + ".png";
            } else {
                png = path + prime[number % 8] + types[type] + ".png";
            }
            if (!avoidDuplicate.contains(png)) {
                numbers[i] = number + 2;
                avoidDuplicate.add(png);
                ImageView imageView = new ImageView(new Image(png));
                imageView.setFitWidth(100);
                imageView.setFitHeight(150);
                imageViews[i] = imageView;
                i++;
            }
        }
        hBox2.getChildren().clear();
        hBox2.getChildren().addAll(imageViews);
        hBox2.setAlignment(Pos.CENTER);
    }

    //(2 + 3) * 5 == 2 3 + 5 *
    //2 + (3 * 5) == 2 3 5 * +
    //2 + 3 * 5 != 2 3 + 5 *
    //2 + 3 * 5 == 2 3 5 * +
    public String postfixToInfix(String task){

        StringBuilder t = new StringBuilder();
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        for(int i = 0; i < task.length(); i++){
            if(task.charAt(i) == '('){

            }
        }
        return null;
    }

    public int calculate(String task){
        Stack<Integer> operand = new Stack<>();
        while(task.length() != 0){
            String oo = insert(task);
            if(oo == null){
                break;
            }
            if(start >= task.length()){
                task = task.substring(task.length());
            }
            else{
                task = task.substring(start);
            }
            if(oo.equals("+") || oo.equals("-") || oo.equals("*") || oo.equals("/")){
                int num2 = operand.pop();
                int num1 = operand.pop();
                switch (oo) {
                    case "+":
                        operand.push(num1 + num2);
                        break;
                    case "-":
                        operand.push(num1 - num2);
                        break;
                    case "*":
                        operand.push(num1 * num2);
                        break;
                    default:
                        operand.push(num1 / num2);
                        break;
                }
            }
            else{
                operand.push(Integer.parseInt(oo));
            }
        }
        return operand.size() == 0 ? -1 : operand.pop();
    }
    public String insert(String task){
        StringBuilder t = new StringBuilder();
        boolean num = false;
        for(int i = 0; i < task.length(); i++){
            if(task.charAt(i) >= '0' && task.charAt(i) <= '9'){
                t.append(task.charAt(i));
                num = true;
            }
            else if((task.charAt(i) == '+' || task.charAt(i) == '-' || task.charAt(i) == '*' || task.charAt(i) == '/') && t.length() == 0){
                start = i + 1;
                return task.charAt(i) + "";
            }
            else if(task.charAt(i) == ' ' && num){
                start = i + 1;
                return t.toString().trim();
            }
        }
        return null;
    }






    public static void main(String[]args){
        launch(args);
    }

}