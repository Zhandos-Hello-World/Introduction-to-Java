/*
(Use Comparator) Write the following generic method using selection sort
and a comparator:

	public static <E> void selectionSort(E[] list,Comparator<? super E> comparator)

Write a test program that creates an array of 10 GeometricObjects and
invokes this method using the GeometricObjectComparator introduced in
Listing 20.4 to sort the elements. Display the sorted elements. Use the following
statement to create the array:

	GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
	 new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
	 new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
	 new Circle(6.5), new Rectangle(4, 5)}; 
*/
import java.util.Scanner;
import java.io.Serializable;
import java.util.Comparator;
public class Exercise20_19{
    public static void main(String[]args){
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};
        selectionSort(list1, new GeometricObjectComparator());
        for(GeometricObject value:list1){
        	System.out.println(value);
        }
    }
    public static<E>void selectionSort(E[]list, Comparator<? super E>comparator){
        int n = list.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (comparator.compare(list[min_idx], list[j]) > 0)
                    min_idx = j;

            E temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable{
    @Override
    public int compare(GeometricObject o1, GeometricObject o2){
        if(o1.getArea() > o2.getArea()){
            return 1;
        }
        else if(o1.getArea() < o1.getArea()){
            return -1;
        }
        return 0;
    }
}



abstract class GeometricObject{
    String color="white";
    boolean filled;
    java.util.Date dateCreated;
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled){
        this.color =color;
        this.filled=filled;
        dateCreated = new java.util.Date();
    }
    public String getColor(){
        return color;
    }
    public String setColor(String color){
        this.color=color;
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "color of shape: "+this.color + "\nis it filled?: "+this.filled + "\ndate created: "+this.dateCreated;
    }
    public abstract double getArea();


}
class Rectangle extends GeometricObject{
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }



    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height + "\nthe area: "+getArea()+
                '}';
    }
}
class Circle extends GeometricObject{
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public double getDiameter(){
        return radius*2;
    }

    public String toString(){
        return super.toString()+ "\nradius is: " +radius;
    }
}
