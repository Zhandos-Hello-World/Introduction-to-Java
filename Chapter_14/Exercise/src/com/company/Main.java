package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
// id: 200103398 37-L Baimurat Zhandos
public class Main{
    public static void main(String[]args){
        // There are pathname of Point1 and Point2. You need to write pathname for your points1 and points2 here in the argument of the "Read".
        MyShape myShape1 = Read("E:\\Import\\JavaExamples\\Chapter_14\\Exercise\\src\\com\\company\\points1.txt");
        MyShape myShape2 = Read("E:\\Import\\JavaExamples\\Chapter_14\\Exercise\\src\\com\\company\\points2.txt");
        // If in points2 has little points when points1 than my program default add 0.0 in the points2
        // If in points1 has little points when points2 than my program default add 0.0 in the points1
        //do not touch the rest. Good luck ^_^
        System.out.print("Choice choose: \n1)calculate the Perimeter\n2)calculate max length of the side: ");
        Scanner str = new Scanner(System.in);
        while(true){
            int choice = str.nextInt();
            if(choice == 1){
                System.out.print("Perimeter: " + myShape1.getPerimeter(myShape2));
                break;
            }
            else if(choice == 2){
                System.out.print("MaxLength: " + myShape1.maxlengthSide(myShape2));
                break;
            }
        }

    }
    public static MyShape Read(String pathname){
        try{
            ArrayList<String> line = new ArrayList<>();
            ArrayList<String> lineSave = new ArrayList<>();
            Scanner str = new Scanner(new File(pathname));
            while(str.hasNext()){
                line.add(str.nextLine());
            }
            str.close();
            for(int i = 0; i < line.size(); i++){
                boolean check = false;
                for(int j = 0; j < line.get(i).length(); j++){
                    if(line.get(i).charAt(j) == ','){
                        lineSave.add(line.get(i).substring(0, j).concat(line.get(i).substring(j + 1)));
                        check = true;
                    }
                }
                if(!check){
                    lineSave.add(line.get(i));
                }
            }
            PrintWriter printWriter = new PrintWriter(new File(pathname));
            for(int i = 0; i < lineSave.size(); i++){
                printWriter.println(lineSave.get(i));
            }
            printWriter.close();
            Scanner str2 = new Scanner(new File(pathname));
            ArrayList<Double> points = new ArrayList<>();
            while (str2.hasNext()){
                points.add(str2.nextDouble());
            }
            str2.close();
            PrintWriter pr = new PrintWriter(new File(pathname));
            for(int i = 0; i < line.size(); i++){
                pr.println(line.get(i));
            }
            pr.close();
            MyShape myShape = new MyShape();
            for(int i = 1; i < points.size(); i+=2){
                myShape.add(points.get(i - 1), points.get(i));
            }
            return myShape;
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
        return null;
    }
}
class MyPoint{
    private double x;
    private double y;
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    MyPoint(){
        this(0,0);
    }

    //These are getter methods -_-
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
    double distance(MyPoint myPoint){
        return (int)(Math.sqrt(Math.pow(myPoint.getX() - this.x, 2) +
                Math.pow(myPoint.getY() - this.y, 2)) * 100) / 100.0;
    }
}
class MyShape{
    private ArrayList<Double> savePoints = new ArrayList<>();
    void add(double x, double y){
        savePoints.add(x);
        savePoints.add(y);
    }
    ArrayList<Double> getSavePoints(){
        return savePoints;
    }
    double []getLastPoint(){
            return new double[]{savePoints.get(savePoints.size() - 2), savePoints.get(savePoints.size() - 1)};
        }
    double getPerimeter(MyShape myShape){
        checkSize(myShape);
        double side = 0;
        for(int i = 0; i < savePoints.size(); i+=2){
            MyPoint points = new MyPoint(savePoints.get(i), savePoints.get(i + 1));
            side += points.distance(new MyPoint(myShape.getSavePoints().get(i), myShape.getSavePoints().get(i + 1)));
        }
        return side;
    }
    double maxlengthSide(MyShape myShape){
        double side = 0;
        checkSize(myShape);
        for(int i = 0; i < savePoints.size(); i+=2){
            MyPoint points = new MyPoint(savePoints.get(i), savePoints.get(i + 1));
            double temp = points.distance(new MyPoint(myShape.getSavePoints().get(i), myShape.getSavePoints().get(i + 1)));
            if(temp > side){
                side = temp;
            }
        }
        return side;
    }
    void checkSize(MyShape myShape){
        if(myShape.getSavePoints().size() < savePoints.size()){
            int a = savePoints.size() - myShape.getSavePoints().size();
            for(int i = 0; i < a; i++){
                myShape.getSavePoints().add(0.0);
            }
        }
        else if(myShape.getSavePoints().size() > savePoints.size()){
            int a = myShape.getSavePoints().size() - savePoints.size();
            for(int i = 0; i < a; i++){
                savePoints.add(0.0);
            }
        }
    }
}


