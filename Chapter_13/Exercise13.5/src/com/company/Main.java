package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        GeometricObject[] circleSave = new Circle[2];
        GeometricObject[] RectangleSave = new Rectangle[2];
        System.out.println("Enter two circles parameters: ");
        circleSave[0] = InputCircle();
        circleSave[1] = InputCircle();
        System.out.println("Enter two rectangles parameters: ");
        RectangleSave[0] = InputRectangle();
        RectangleSave[1] = InputRectangle();
        System.out.print("(1)Information\n" + "(2)difference");
        int choice = str.nextInt();
        if(choice == 1){
            System.out.print("Circles\n-----------\n1");
            System.out.print(circleSave[0].toString() + "\n2" + circleSave[1].toString());
            System.out.print("\n-----------\nRectangles\n1");
            System.out.print(RectangleSave[0].toString() + "\n2" + RectangleSave[1].toString());
        }
        else if(choice == 2){
            System.out.println("          Rectangle1          Rectangle2");
            System.out.println("Area      " + RectangleSave[0].getArea() + "      " +
                    RectangleSave[0].maxArea(RectangleSave[1]) + "      " + RectangleSave[1].getArea());
            System.out.println("Perimeter   " + RectangleSave[0].getArea() + "      " +
                    RectangleSave[0].maxPerimeter(RectangleSave[1]) + RectangleSave[1].getArea());
            System.out.println("-----------------------------------------");
            System.out.println("            Circle1             Circle2");
            System.out.println("Area        " + circleSave[0].getArea() + "    " +
                    circleSave[0].maxArea(circleSave[1]) + "     " + circleSave[1].getArea());
            System.out.println("Perimeter   " + circleSave[1].getPerimeter() + "    " +
                    circleSave[0].maxPerimeter(circleSave[1]) + "     " + circleSave[1].getPerimeter());
        }
    }
    public static Rectangle InputRectangle(){
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Rectangle ");
        System.out.print("Enter first side: ");
        double side1 = str.nextDouble();
        System.out.print("Enter second side: ");
        double side2 = str.nextDouble();
        System.out.print("Enter a color: ");
        str.nextLine();
        String color = str.next();
        System.out.print("Enter a fill(true/false): ");
        boolean fill = str.nextBoolean();
        return new Rectangle(side1, side2, color, fill);
    }


    public static Circle InputCircle(){
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Circle ");
        System.out.print("Enter a radius: ");
        double radius = str.nextDouble();
        System.out.print("Enter a color: ");
        str.nextLine();
        String color = str.next();
        System.out.print("Enter a fill(true/false): ");
        boolean fill = str.nextBoolean();
        return new Circle(radius, color, fill);
    }
}
