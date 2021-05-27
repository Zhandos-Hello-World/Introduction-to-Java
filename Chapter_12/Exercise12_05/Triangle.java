
public class Triangle extends GeometricObject{
    private String color;
    private boolean filled;

    Triangle(){
        super();
    }
    Triangle(double side1, double side2, double side3, String color,boolean filled) throws IllegalTriangleException{
        super(side1, side2, side3);
        this.filled = filled;
        this.color = color;
    }

    double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double getPerimeter(){
        return side1 + side2 + side3;
    }

    String getColor(boolean filled){
        if(filled){
            return color;
        }
        else{
            return "null";
        }
    }


    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3 + " color = " + getColor(filled);
    }
}
