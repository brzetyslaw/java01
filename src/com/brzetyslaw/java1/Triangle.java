package com.brzetyslaw.java1;


/**
 * Created by user001 on 2016-03-25.
 */
public class Triangle extends Figure implements IPrint{
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(a + b + c);
    }

    @Override
    public void calculateArea() {
        double p = 0.5 * (a + b + c);
        setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public void print() {
        System.out.println("Dane dla figury trojkat\n" + "Bok a: " + a + "\nBok b: " + b + "\nBok c: " + c +
                "\nObwod: " + getPerimeter() + "\nPole: " + getArea() + "\n");
    }
}
