public class GeometricObject {
    double side1;
    double side2;
    double side3;
    private boolean filed;
    private String color;

    GeometricObject(){
        side1 = side2 = side3 = 1.0;
    }
    GeometricObject(double side1, double side2, double side3)throws IllegalTriangleException{
        if((side1 + side2) > side3 || (side2 + side3) > side1 || (side1 + side3) > side2)
            throw new IllegalTriangleException("Any two sides is greater than the other side");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    boolean getFilled(){
        return filed;
    }
    String getColor(){
        return color;
    }

    void setFiled(boolean filled){
        this.filed = filled;
    }
    void setColor(String color){
        this.color = color;
    }
}