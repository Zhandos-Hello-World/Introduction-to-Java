package com.company;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;




class dataSquares{
    private int size = 10;
    private ImageView[] imageView;
    private Image image;
    private int index = 0;

    dataSquares(Image image){
        this.image = image;
        imageView = new ImageView[size];
        for(int i = 0; i < size; i++){
            imageView[i] = new ImageView(image);
            imageView[i].setFitHeight(50);
            imageView[i].setFitWidth(50);
        }
    }
    public ImageView getImage(){
        index++;
        if(index == size - 1){
            ImageView[]temp = null;
            this.size += 10;
            temp = new ImageView[size];
            for(int i = 0; i < imageView.length; i++){
                temp[i] = imageView[i];
            }
            for(int i = imageView.length - 1; i < this.size; i++){
                temp[i] = new ImageView(image);
                temp[i].setFitHeight(50);
                temp[i].setFitWidth(50);
            }
            imageView = temp;
        }
        return imageView[index - 1];
    }

}

class dataSquaresTank{
    private static int size = 10;
    private static ImageView[] imageView;
    private static Image image;
    private static int index = 0;
    private static boolean r, l, d, u = true;

    dataSquaresTank(Image image){
        dataSquaresTank.image = image;
        imageView = new ImageView[size];
        for(int i = 0; i < size; i++){
            imageView[i] = new ImageView(image);
            imageView[i].setFitHeight(50);
            imageView[i].setFitWidth(50);
        }
    }
    public ImageView getImage(){
        index++;
        if(index == size - 1){
            ImageView[]temp = null;
            this.size += 10;
            temp = new ImageView[size];
            for(int i = 0; i < imageView.length; i++){
                temp[i] = imageView[i];
            }
            for(int i = imageView.length - 1; i < this.size; i++){
                temp[i] = new ImageView(image);
                temp[i].setFitHeight(50);
                temp[i].setFitWidth(50);
                if(r){
                    temp[i].setRotate(90);
                }
                else if(l){
                    temp[i].setRotate(-90);

                }
                else if(d){
                    temp[i].setRotate(180);

                }
                else if(u){
                    temp[i].setRotate(0);
                }
            }
            imageView = temp;
        }
        return imageView[index - 1];
    }
    public void RLDU(int[]arr){
        r = false;
        l = false;
        d = false;
        u = false;
        if(arr[0] == 1){
            r = true;
            imageView[index].setRotate(90);
            imageView[index-1].setRotate(90);
            imageView[index-2].setRotate(90);
        }
        else if(arr[1] == 1){
            l = true;
            imageView[index].setRotate(-90);
            imageView[index-1].setRotate(-90);
            imageView[index-2].setRotate(-90);
        }
        else if(arr[2] == 1) {
            d = true;
            imageView[index].setRotate(180);
            imageView[index-1].setRotate(180);
            imageView[index-2].setRotate(180);
        }
        else{
            u = true;
            imageView[index].setRotate(0);
            imageView[index-1].setRotate(0);
            imageView[index-2].setRotate(0);
        }
    }
}

class Game {
    Player player;
    private int x;
    private int y;
    private Map map;

    Game(Map map) throws InvalidMapException{
        this.map=map;
        if(map.getSize()==0){
            throw new InvalidMapException("Map size can not be zero");
        }
        String[][] arr = new String[map.getSize()][map.getSize()];
        for(int i = 0;i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = map.getValueAt(i,j);
                if(arr[i][j].equals("P")){
                    x=i;
                    y=j;
                }
            }
        }

    }
    public void setMap(Map map){
        this.map=map;
    }
    public void addPlayer(Player player){
        this.player=player;
        player.setMap(this.map);
        player.setPosition(this.x, this.y);
    }
}
class MyPlayer implements Player{
    public Position position1=null;
    private int x;
    private int y;
    Map map;
    Position pos;
    @Override
    public void setMap(Map map){
        this.map=map;
        position1 = map.pos;
    }
    public void moveRight() {
        if(position1.getX()!=map.getSize()-1)
            if((map.getValueAt(position1.getX()+1 , position1.getY()).equals("0") ||
                    map.getValueAt(position1.getX()+1, position1.getY()).equals("P") )){
                position1.setX(position1.getX()+1);
                this.map.setPositionTank(position1);
            }
    }

    public void moveLeft() {
        if(position1.getX()!=0)
            if((map.getValueAt(position1.getX()-1 , position1.getY()).equals("0"))||
                    (map.getValueAt(position1.getX()-1, position1.getY()).equals("P"))){
                position1.setX(position1.getX()-1);
                this.map.setPositionTank(position1);
            }
    }
    public void moveDown() {
        if(position1.getY()!=map.getSize()-1)
            if((map.getValueAt(position1.getX() , position1.getY()+1).equals("0")) ||
                    (map.getValueAt(position1.getX(), position1.getY()+1).equals("P"))){
                position1.setY(position1.getY()+1);
                this.map.setPositionTank(position1);
            }}

    public void moveUp() {
        if(position1.getY()!=0)
            if((map.getValueAt(position1.getX(), position1.getY()-1).equals("0")) ||
                    (map.getValueAt(position1.getX(), position1.getY()-1).equals("P"))){
                position1.setY(position1.getY()-1);
                this.map.setPositionTank(position1);
            }
    }

    public Position getPosition(){
        return position1;
    }
    public Position setPosition(int x, int y){
        this.position1=new Position(x, y);
        return position1;
    }
}
class Tank extends MyPlayer{
    private int[] rldu = {0, 0, 0, 1};

    private void defaultArr(){
        Arrays.fill(rldu, 0);
    }
    public void moveRight() {
        if(rldu[0] == 1){
            super.moveRight();
            map.RLDU(rldu);
        }
        else{
            defaultArr();
            rldu[0] = 1;
        }
    }

    public void moveLeft() {
        if(rldu[1] == 1){
            super.moveLeft();
            map.RLDU(rldu);
        }
        else{
            defaultArr();
            rldu[1] = 1;
        }
    }
    public void moveDown() {
        if(rldu[2] == 1){
            super.moveDown();
            map.RLDU(rldu);
        }
        else{
            defaultArr();
            rldu[2] = 1;
        }

    }

    public void moveUp() {
        if(rldu[3] == 1){
            super.moveUp();
            map.RLDU(rldu);
        }
        else{
            defaultArr();
            rldu[3] = 1;
        }
    }
}



class Position{
    private int x;
    private int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public boolean equals(Position position){
        return (this.x==position.getX() && this.y== position.getY()) ? true : false;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
interface Player{
    void moveRight();
    void moveLeft();
    void moveDown();
    void moveUp();
    void setMap(Map map);
    Position getPosition();
    Position setPosition(int x, int y);
}
class Map {
    private String arr[][];
    private int size;
    MyPlayer player;
    Map map;
    int x,y;
    Position pos;
    private GridPane currentMap = new GridPane();
    private dataSquaresTank tankUI = new dataSquaresTank(new Image("https://images-na.ssl-images-amazon.com/images/I/11s0jsOXhpL.png"));
    private dataSquares redData = new dataSquares(new Image("https://lh5.googleusercontent.com/e9LO_BbOEA2MC1S0M1zoiF7LCmmyH6oeHqeat9rY2qWr2siRHg1nIRmdyJ6qmhFovfGpIoJ4VHuG4WNYQ87MQINvinS4q1vMEmzP7PVvkT9uBEVs4VcFS2jal98aPvOQQ_MK4CZZ"));
    private dataSquares grassData = new dataSquares(new Image("https://lh4.googleusercontent.com/iKLppp4jGyg3J0B6raPneddPCXky0gixqG-czjBfjQKZonpyJ7D4iNvAPuuY6HLvx7toecdMzct76DV2_wL9SK9_u9Ob9ZvlOXsj9yY"));
    private dataSquares grayData = new dataSquares(new Image("https://lh6.googleusercontent.com/5aSH5vikDFrxZKo51KPM3VKUOYLvs8uG8QEMj_uDJLgfTbF44QrkqNS7d2rZaCTSmdt9_fQe4Co6Fu14zUBTkD_SVAPlUqTjx_7zoboGAc9OohBzJsxxZBGZ3Futltc22DhcfreY"));
    private dataSquares water = new dataSquares(new Image("https://lh5.googleusercontent.com/YpLb7HnQHK4yiHOrbQc3k61P73aSWRUaLC6M1bPkzGnsxSnUGIb5Bz2SZOlX1h3WipZhDc6fZgA5uYR24WH3k0SsMDS_aAF3tPc5Yf8"));

    public Map(Scanner input) throws InvalidMapException{
        currentMap.setStyle("-fx-background-color: black");
        int N = 8;
        this.size=input.nextInt();
        arr = new String[size][size];
        for(int i = 0; i < size;  i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = input.next();
                if(arr[i][j].equals("P") || arr[i][j].equals("1") || arr[i][j].equals("0") || arr[i][j].equals("W") || arr[i][j].equals("B") || arr[i][j].equals("G") || arr[i][j].equals("R")){
                    if(arr[i][j].equals("P")){
                        pos = new Position(j, i);
                        currentMap.add(tankUI.getImage(), j, i);
                    }
                    else if(arr[i][j].equals("1")){
                        currentMap.add(redData.getImage(), j, i);
                    }
                    else if(arr[i][j].equals("0")){
                        currentMap.add(new Rectangle(50, 50, new Color(0,0,0, 1)), j, i);
                    }
                    else if(arr[i][j].equals("W")){
                        currentMap.add(water.getImage(), j, i);
                    }
                    else if(arr[i][j].equals("B")){
                        currentMap.add(grayData.getImage(), j, i);
                    }
                    else if(arr[i][j].equals("R")){
                        currentMap.add(redData.getImage(), j, i);
                    }
                    else{
                        currentMap.add(grassData.getImage(), j, i);
                    }

                }
                else{
                    throw new InvalidMapException("Not enough map elements");
                }
            }
        }
        input.close();
    }
    public GridPane getCurrentMap(){
        return currentMap;
    }
    public int getSize(){
        return this.size;
    }
    public String getValueAt(int x, int y){
        return arr[y][x];
    }
    public void print(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void setPositionTank(Position positionCurrent){
        this.x = positionCurrent.getX();
        this.y = positionCurrent.getY();
        currentMap.add(tankUI.getImage(), x, y);
        currentMap.add(new Rectangle(50, 50, new Color(0,0,0, 1)), pos.getX(), pos.getY());
        pos = new Position(this.x, this.y);
    }
    public void RLDU(int[]arr){
        tankUI.RLDU(arr);
    }
}
class InvalidMapException extends Exception {
    private String message="Not enough map elements";
    public InvalidMapException(){}
    public InvalidMapException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException{
        Scanner input = new Scanner(new File("src\\com\\company\\map1.txt"));
        Player player = new Tank();
        Game game = null;
        Map map = null;
        try{
            map = new Map(input);
            game = new Game(map);
        }
        catch(InvalidMapException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        game.addPlayer(player);
        Scene scene = new Scene(map.getCurrentMap());
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(ActionE ->{
            switch (ActionE.getCode()){
                case UP:player.moveUp();break;
                case DOWN:player.moveDown();break;
                case RIGHT:player.moveRight();break;
                case LEFT:player.moveLeft();break;
            }
            // System.out.println(ActionE.getCode());
        });
    }
}