package com.homework.figures;

import com.homework.point.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = new MyPoint(v1.getX(), v1.getY());
        this.v2 = new MyPoint(v2.getX(), v2.getY());
        this.v3 = new MyPoint(v3.getX(), v3.getY());
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
    }
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        String result;
        if (side1 == side2 && side1 == side3){
            result = "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3){
            result = "Isosceles";
        } else{
            result = "Scalene";
        }
        return result;
    }

}
