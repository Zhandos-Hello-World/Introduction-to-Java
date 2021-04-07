package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Point []points = new Point[100];
        for(int i = 0; i < 100; i ++){
            int randomX = (int)(Math.random() * 100);
            int randomY = (int)(Math.random() * 100);
            points[i] = new Point(randomX, randomY);
        }
        Arrays.sort(points, Point::compareTo);
        for(Point point:points){
            System.out.println(point.getX() + " " + point.getY());
        }
    }
}
class Point implements Comparable<Point>, Comparator<Point>{
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o){
        if(o.getX() > getX()){
            return 1;
        }
        else if(o.getX() < getX()){
            return -1;
        }
        else{
            if(o.getY() > getY()){
                return 1;
            }
            else if(o.getY() < getY()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.getY() > o2.getY()){
            return 1;
        }
        else if(o1.getY() < o2.getY()) {
            return -1;
        }
        else{
            if(o1.getX() > o2.getX()){
                return 1;
            }
            else if(o1.getX() < o2.getX()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
