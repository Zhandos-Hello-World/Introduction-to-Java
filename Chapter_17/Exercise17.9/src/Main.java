/*
(Address book) Write a program that stores, retrieves, adds, and updates addresses as
shown in Figure 17.20. Use a fixed-length string for storing each attribute in the address.
Use random-access file for reading and writing an address. Assume the sizes of the
name, street, city, state, and zip are 32, 32, 20, 2, and 5 bytes, respectively.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//for Binary I/O
import java.io.*;
import java.util.LinkedList;

public class Main extends Application {
    private static Label[]labels = {new Label("Name"), new Label("Street"),
                                            new Label("City"), new Label("State"), new Label("Zip")};
    private static TextField[]textFields = {new TextField(), new TextField(),
                                             new TextField(), new TextField(), new TextField()};
    private static Button[]buttons = {new Button("Add"), new Button("First"), new Button("Next"),
                                             new Button("Previous"), new Button("Last"), new Button("Update")};
    private static File file = new File("Exercise17_9.dat");
    private static int indexOfTheSeek;
    private static int size;
    private static LinkedList<String> tempList;
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flowPane1 = new FlowPane(Orientation.HORIZONTAL, 10, 10, labels[0], textFields[0]);
        FlowPane flowPane2 = new FlowPane(Orientation.HORIZONTAL, 10, 10, labels[1], textFields[1]);
        FlowPane flowPane3 = new FlowPane(Orientation.HORIZONTAL, 10, 10, labels[2], textFields[2], labels[3], textFields[3], labels[4], textFields[4]);
        FlowPane buttonRoot = new FlowPane(Orientation.HORIZONTAL, 14, 14, buttons);
        VBox vbox = new VBox(flowPane1, flowPane2, flowPane3, buttonRoot);
        stage.setScene(new Scene(vbox, 410, 160));
        stage.setResizable(false);
        stage.show();

        //settings for Padding
        textFields[0].setMinWidth(355);
        textFields[1].setMinWidth(355);
        labels[2].setPadding(new Insets(0, 15, 0, 0));
        textFields[2].setMaxWidth(150);
        textFields[3].setMaxWidth(40);
        textFields[4].setMaxWidth(70);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setSpacing(10);

        //checking attention to the location of the map
        boolean attention = false;
        if(file.exists()){
            attention = true;
        }

        //for index of the seek
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            //checking File for attention and empty
            if (attention && raf.length() != 0) {
                //we need to understand size
                raf.seek(0);
                try {
                    while (true) {
                        raf.readUTF();
                        indexOfTheSeek++;
                        size++;
                    }
                } catch (EOFException EX) {
                    raf.seek(indexOfTheSeek);
                }
            }
        }

        //for actions of the Buttons
        for(int i = 0; i < buttons.length; i++){
            int finalI = i;
            buttons[i].setOnAction(E -> {
                try{
                    if(check()){
                        //for "Add"
                        if(finalI == 0){
                            clickAdd();
                        }
                        //for "Update"
                        else if(finalI == 5){
                            clickUpdate();
                        }
                    }
                    if(checkEmptyFile()){
                        //for "First"
                        if(finalI == 1){
                            clickFirst();
                        }
                        //for "Last"
                        if(finalI == 4){
                            clickLast();
                        }
                        //for "Next"
                        if(finalI == 2){
                            clickNext();
                        }
                        //for "Previous"
                        else if(finalI == 3){
                            clickPrevious();
                        }
                    }
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            });
        }
    }

    public void clickAdd() throws IOException{
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        tempList = new LinkedList<>();
        try{ while(true)tempList.add(raf.readUTF());}
        catch (EOFException exception){
            //these codes clear file
            FileWriter fwOb = new FileWriter(file, false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
            raf.seek(0);
            String temp = "";
            for(TextField texts:textFields){
                temp = temp.concat(texts.getText() + " ");
                texts.clear();
            }
            for(String str:tempList){
                if(!str.isEmpty()) raf.writeUTF(str);
            }
            if(!temp.isEmpty())
                raf.writeUTF(temp);
            raf.close();
            indexOfTheSeek++;
            size++;
        }
    }
    public void clickFirst() throws IOException{
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        tempList = new LinkedList<>();
        try{ while(true)tempList.add(raf.readUTF());}
        catch (EOFException exception){
            String str = tempList.getFirst();
            String []temp = new String[5];
            int start = 0, end = 0, index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    if(index != 0){
                        start = end;
                    }
                    end = i;
                    if(index == 0){
                        temp[index] = str.substring(start, end);
                    }
                    else{
                        temp[index] = str.substring(start + 1, end);
                    }
                    index++;
                }
            }
            for(int i = 0; i < temp.length; i++){
                textFields[i].setText(temp[i]);
            }
            raf.close();
            indexOfTheSeek = 0;
        }
    }
    public void clickLast() throws IOException{
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        tempList = new LinkedList<>();
        try{ while(true)tempList.add(raf.readUTF());}
        catch (EOFException exception){
            String str = tempList.get(tempList.size() - 1);
            String []tempArr = new String[5];
            int start = 0, end = 0, index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    if(index != 0){
                        start = end;
                    }
                    end = i;
                    if(index == 0){
                        tempArr[index] = str.substring(start, end);
                    }
                    else{
                        tempArr[index] = str.substring(start + 1, end);
                    }
                    index++;
                }
            }
            for(int i = 0; i < tempArr.length; i++){
                textFields[i].setText(tempArr[i]);
            }
            raf.close();
            indexOfTheSeek = size - 1;
        }
    }
    public void clickPrevious()throws IOException{
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        tempList = new LinkedList<>();
        try{ while(true)tempList.add(raf.readUTF());}
        catch (EOFException exception){
            if(indexOfTheSeek != 0){
                indexOfTheSeek -= 1;
            }
            String str = tempList.get(indexOfTheSeek);
            String []tempArr = new String[5];
            int start = 0, end = 0, index = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    if(index != 0){
                        start = end;
                    }
                    end = i;
                    if(index == 0){
                        tempArr[index] = str.substring(start, end);
                    }
                    else{
                        tempArr[index] = str.substring(start + 1, end);
                    }
                    index++;
                }
            }
            for(int i = 0; i < tempArr.length; i++){
                textFields[i].setText(tempArr[i]);
            }
            raf.close();
        }
    }

    public void clickNext()throws IOException{
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        tempList = new LinkedList<>();
        try{ while(true)tempList.add(raf.readUTF());}
        catch (EOFException exception){
            if(indexOfTheSeek < size - 1){
                indexOfTheSeek += 1;
                String str = tempList.get(indexOfTheSeek);
                String []tempArr = new String[5];
                int start = 0, end = 0, index = 0;
                for(int i = 0; i < str.length(); i++){
                    if(str.charAt(i) == ' '){
                        if(index != 0){
                            start = end;
                        }
                        end = i;
                        if(index == 0){
                            tempArr[index] = str.substring(start, end);
                        }
                        else{
                            tempArr[index] = str.substring(start + 1, end);
                        }
                        index++;
                    }
                }
                for(int i = 0; i < tempArr.length; i++){
                    textFields[i].setText(tempArr[i]);
                }
            }
            raf.close();
        }
    }
    public void clickUpdate() throws IOException{
        RandomAccessFile ras = new RandomAccessFile(file, "rw");
        String str = "";
        for(TextField text:textFields){
            str = str.concat(text.getText() + " ");
        }
        if(check() && !tempList.get(indexOfTheSeek).equals(str)){
            //these codes clear file
            FileWriter fwOb = new FileWriter(file, false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
            ras.seek(0);
            tempList.remove(indexOfTheSeek);
            tempList.add(indexOfTheSeek, str);
            for(String s:tempList){
                if(!str.isEmpty()) ras.writeUTF(s);
            }
        }
        ras.close();
    }

    public boolean checkEmptyFile() throws IOException{
        RandomAccessFile ras = new RandomAccessFile(file, "rw");
        ras.seek(0);
        boolean check =  ras.length() != 0;
        ras.close();
        return check;
    }


    //for full fill in
    public boolean check(){
        for(TextField texts:textFields){
            if(texts.getText().isEmpty()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        launch(args);
    }
}
