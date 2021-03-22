package com.company;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    private double side;
    Octagon(double side){
        this.side = side;
    }
    public int compareTo(Octagon octagon){
        if(side > octagon.getSide()){
            return 1;
        }
        else if(side < octagon.getSide()){
            return -1;
        }
        else{
            return 0;
        }
    }


    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    double getArea() {
        return (int)(num * side * side * 100) / 100.0;
    }
    @Override
    double getPerimeter(){
        return 8 * side;
    }

    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    public String toString(){
        return "Octagon\n" + "side: " + getSide() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }

}
