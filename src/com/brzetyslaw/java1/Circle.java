package com.brzetyslaw.java1;

/**
 * Created by user001 on 2016-03-25.
 */
public class Circle extends Figure implements IPrint {
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * r);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * (r * r));
    }

    @Override
    public void print() {
        System.out.println("Dane dla figury kolo\n" + "Promien: " + r + "\nObwod: " + getPerimeter() + "\nPole: " +
                getArea() + "\n");
    }
}
