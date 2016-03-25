package com.brzetyslaw.java1;

/**
 * Created by user001 on 2016-03-25.
 */
public class Square extends Figure implements IPrint {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(4 * a);
    }

    @Override
    public void calculateArea() {
        setArea(a * a);
    }

    @Override
    public void print() {
        System.out.println("Dane dla figury kwadrat\n" + "Bok: " + a + "\nObwod: " + getPerimeter() + "\nPole:" +
                getArea() + "\n");
    }
}
