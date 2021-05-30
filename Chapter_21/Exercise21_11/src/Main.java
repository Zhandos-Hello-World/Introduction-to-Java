/*
(Baby name popularity ranking) Use the data files from Programming Exercise 12.31
to write a program that enables the user to select a year, gender, and enter a
name to display the ranking of the name for the selected year and gender, as
shown in Figure 21.9. To achieve the best efficiency, create two arrays for boy’s
names and girl’s names, respectively. Each array has 10 elements for 10 years.
Each element is a map that stores a name and its ranking in a pair with the name
as the key
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main extends Application {
    private static int years;
    private static boolean MF;
    private static String name;
    private static boolean check[] = new boolean[2];

    private static final String[]links = {
            "http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2002.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2003.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2004.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2005.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2006.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2007.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2008.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2009.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt",
    };
    public void start(Stage primaryStage) throws MalformedURLException, IOException {
        TextField name = new TextField();
        Button findRacking = new Button("Find Ranking");

        GridPane group = new GridPane();
        group.add(new Label("Select a year:"), 0, 0);
        group.add(yearsMenuButton(), 1,0);
        group.add(new Label("Boy or girl?"), 0, 1);
        group.add(genderMenuButton(), 1, 1);
        group.add(new Label("Enter a name:"), 0, 2);
        group.add(name, 1, 2);
        group.add(findRacking, 1, 3);
        group.setAlignment(Pos.CENTER);


        Label mention = new Label();


        VBox root = new VBox(group, mention);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Exercise21_11");
        primaryStage.show();

        LinkedHashMap<String, Integer>[]male = new LinkedHashMap[10];
        for(int i = 0; i < male.length; i++){
            male[i] = new LinkedHashMap<>();
        }


        LinkedHashMap<String, Integer>[]female = new LinkedHashMap[10];
        for(int i = 0; i < female.length; i++){
            female[i] = new LinkedHashMap<>();
        }

        for(int i = 0; i < 10; i++){
            URL url = new URL(links[i]);
            try(Scanner scanner = new Scanner(url.openStream())){
                while(scanner.hasNextLine()){
                    int rank = scanner.nextInt();
                    male[i].put(scanner.next(), rank);
                    scanner.next();
                    female[i].put(scanner.next(), rank);
                    scanner.next();
                }
            }
        }

        findRacking.setOnAction(e -> {
            if(check[0] && check[1] && !name.getText().isEmpty()){
                if(MF){
                    if(male[years].containsKey(name.getText().trim()))
                        mention.setText("Boy name Michael is ranked #" + male[years].get(name.getText().trim()).toString() + " in years " + (2001 + years));
                    else
                        mention.setText("The name " + name.getText() + " is not ranked in years " + (2001 + years));
                }
                else{
                    if(female[years].containsKey(name.getText().trim()))
                        mention.setText("Boy name Michael is ranked #" + female[years].get(name.getText().trim()).toString() + " in years " + (2001 + years));
                    else
                        mention.setText("The name " + name.getText() + " is not ranked in years " + (2001 + years));
                }
            }
        });


    }

    private MenuButton genderMenuButton(){
        MenuButton gender = new MenuButton();
        MenuItem[]menuItems = new MenuItem[2];
        menuItems[0] = new MenuItem("Male");
        menuItems[1] = new MenuItem("Female");
        menuItems[0].setOnAction(event -> {
            gender.setText(menuItems[0].getText());
            check[1] = true;
            MF = true;
        });
        menuItems[1].setOnAction(event -> {
            gender.setText(menuItems[1].getText());
            MF = false;
            check[1] = true;
        });
        gender.getItems().addAll(menuItems);
        return gender;
    }
    private MenuButton yearsMenuButton(){
        MenuButton yearsBtn = new MenuButton();
        MenuItem[]items = new MenuItem[10];
        for(int i = 0; i < items.length; i++){
            items[i] = new MenuItem(2001 + i + "");
            int finalI = i;
            items[i].setOnAction(e ->{
                yearsBtn.setText(items[finalI].getText());
                check[0] = true;
                years = finalI;
            });
        }
        yearsBtn.getItems().addAll(items);
        return yearsBtn;
    }
    public static void main(String[]args){
        launch(args);
    }
}
