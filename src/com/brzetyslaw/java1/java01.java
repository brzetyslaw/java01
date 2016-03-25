package com.brzetyslaw.java1;

import java.util.*;

/**
 * Created by user001 on 2016-03-25.
 */
public class java01 {
    public static void main(String[] args) {
        System.out.println("Wybierz figurę:\n0 - Wyjscie\n1 - Trojkat\n2 - Kwadrat\n3 - Kolo");
        Scanner scanner = new Scanner(System.in);
        double menu = scanner.nextDouble();
        if (menu == 1) {
            System.out.println("Podaj dlugosci bokow trojkata\nPodaj bok a: ");
            double a = scanner.nextDouble();
            System.out.println("Podaj bok b: ");
            double b = scanner.nextDouble();
            System.out.println("Podaj bok c: ");
            double c = scanner.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            triangle.calculatePerimeter();
            triangle.calculateArea();
            triangle.print();

        }
        else if (menu == 2) {
            System.out.println("Podaj dlugosc boku kwadratu: ");
            double a = scanner.nextDouble();
            Square square = new Square(a);
            square.calculatePerimeter();
            square.calculateArea();
            square.print();
        }
        else if (menu == 3) {
            System.out.println("Podaj dlugosc promienia: ");
            double r = scanner.nextDouble();
            Circle circle = new Circle(r);
            circle.calculatePerimeter();
            circle.calculateArea();
            circle.print();
        }
        else
            System.exit(0);
    }
}
