package com.brzetyslaw.java1;

/**
 * Created by user001 on 2016-03-25.
 */
public abstract class Figure {
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
