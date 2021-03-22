package com.company;
public class Main {

    public static void main(String[] args) {
        GeometricObject[] a = {new Rectangle(12, 23), new Rectangle(2, 4),
                                new Circle(3), new Circle(43)};
        System.out.print(sumArea(a));
    }
    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i].getArea();
        }
        return sum;
    }
}
