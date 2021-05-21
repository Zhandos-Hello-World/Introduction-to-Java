import java.util.Arrays;
import java.util.Comparator;

/*
(Use Comparator) Write the following generic method using selection sort
and a comparator:
public static <E> void selectionSort(E[] list,
 Comparator<? super E> comparator)
Write a test program that creates an array of 10 GeometricObjects and
invokes this method using the GeometricObjectComparator introduced inListing 20.5 to sort the elements. Display the sorted elements. Use the following
statement to create the array:
GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
 new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
 new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
 new Circle(6.5), new Rectangle(4, 5)};
Also in the same program, write the code that sorts six strings by their last
character. Use the following statement to create the array:
String[] list2 = {"red", "blue", "green", "yellow", "orange",
 "pink"};
 */
import java.io.Serializable;

public class Main {
    public static void main(String[]args){
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};
        selectionSort(list1, new GeometricObjectComparator());
        Arrays.asList(list1).forEach(e -> System.out.println(e.getArea()));
        String[] list2 = {"red", "blue", "green", "yellow", "orange", "pink"};
        selectionSort(list2, new StringComparator());
        Arrays.asList(list2).forEach(System.out::println);

    }
    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
        int n = list.length;
        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(comparator.compare(list[j], list[min_idx]) < 0){
                    min_idx = j;
                }
            }
            E temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
    }
}
class StringComparator implements Comparator<String>, Serializable{
    @Override
    public int compare(String o1, String o2) {
        String o1Reversed = reverse(o1);
        String o2Reversed = reverse(o2);
        if(o1Reversed.compareTo(o2Reversed) > 0){
            return 1;
        }
        else if(o1Reversed.compareTo(o2Reversed) < 0){
            return -1;
        }
        return 0;
    }
    public String reverse(String o){
        String temp = "";
        for(int i = o.length() - 1; i >= 0; i--){
            temp = temp.concat(String.valueOf(o.charAt(i)));
        }
        return temp;
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable{

    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        if(o1.getArea() > o2.getArea()){
            return 1;
        }
        else if(o1.getArea() < o2.getArea()){
            return -1;
        }
        return 0;
    }
}


abstract class GeometricObject implements Comparable<GeometricObject>{
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
    @Override
    public int compareTo(GeometricObject o) {
        if(getArea()>o.getArea())
            return 1;
        else if (getArea()<o.getArea())
            return -1;
        else
            return 0;

    }

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
        // this.radius = 0;
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
        double area = 3.14*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
    public double getDiameter(){
        return radius*2;
    }
    public void printCircle(){
        System.out.println("created on"+getDateCreated()+"and the radius is"+ radius);
    }
    public String toString(){
        return super.toString()+ "\nradius is: " +radius;
    }


}


