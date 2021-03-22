package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        GeometricObject[] go = new Square[5];
        for(int i = 0; i < go.length; i++){
            System.out.println((int)(i + 1) + " Square");
            System.out.print("Side: ");
            double side = str.nextDouble();
            System.out.print("Color: ");
            str.nextLine();
            String color = str.next();
            System.out.print("Fill(true/false)");
            boolean fill = str.nextBoolean();
            go[i] = new Square(side, color, fill);
        }
        System.out.println("   Result");
        System.out.println("-------------");
        for(int i = 0; i < go.length; i++){
            String s = "";
            System.out.print("Square + #" + (i+1) + "\nArea: " + go[i].getArea() + "\nColor: " + go[i].getColor());
            if(go[i].getFill()){
                go[i].howToColor();
            }
        }
    }
}
