package com.company;

public class Triangle2D {
    private MyPoin p1 = new double[2];
    private double[] p2 = new double[2];
    private double[] p3 = new double[2];

    Triangle2D(){
        p1[0] = 0;
        p1[1] = 0;
        p2[0] = 1;
        p2[1] = 1;
        p3[0] = 2;
        p3[0] = 5;
    }



    void setP1(double[] p1){
        this.p1 = p1;
    }
    void setP2(double[] p2){
        this.p2 = p2;
    }
    void setP3(double[] p3){
        this.p3 = p3;
    }
    void setPoints(double[] p1, double[] p2, double[] p3){
        setP1(p1);
        setP2(p2);
        setP3(p3);
    }
    void setPoints(double[][]points){
        p1[0] = points[0][0];
        p1[1] = points[0][1];
        p2[0] = points[1][0];
        p2[1] = points[1][1];
        p3[0] = points[2][0];
        p3[3] = points[2][1];
    }


    double[] getP1(){
        return p1;
    }
    double[] getP2(){
        return p2;
    }
    double[] getP3(){
        return p3;
    }

    double getArea(){
        double a = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
        double b = Math.sqrt(Math.pow(p3[0] - p1[0], 2) + Math.pow(p3[1] - p1[1], 2));
        double c = Math.sqrt(Math.pow(p2[0] - p3[0], 2) + Math.pow(p2[1] - p3[1], 2));
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return (int)(area * 100) / 100.0;
    }
    double getPerimeter(){
        double a = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
        double b = Math.sqrt(Math.pow(p3[0] - p1[0], 2) + Math.pow(p3[1] - p1[1], 2));
        double c = Math.sqrt(Math.pow(p2[0] - p3[0], 2) + Math.pow(p2[1] - p3[1], 2));
        return a + b + c;
    }

    boolean contains(Triangle2D t){
        double maxX = getMax(p1.x, p2.x, p3.x);
        double maxY = getMax(p1.y, p2.y, p3.y);

        // Get min X & Y
        double minX = getMin(p1.x, p2.x, p3.x);
        double minY = getMin(p1.y, p2.y, p3.y);

        // Outside the bounding rectangle of the triangle
        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        // Check if point is the border of the triangle
        MyPoint p = new MyPoint(x, y);
        boolean side1 = p.onTheLineSegment(p1, p2);
        boolean side2 = p.onTheLineSegment(p1, p3);
        boolean side3 = p.onTheLineSegment(p2, p3);
        return side1 || side2 || side3;
    }
    boolean overlaps(Triangle2D t){

    }
}
