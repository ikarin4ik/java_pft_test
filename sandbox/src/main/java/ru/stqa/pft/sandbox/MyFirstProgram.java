package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main (String[] args) {
        hello("world");


        int l = 68;
        int s = l * l;
        System.out.println("Площадь квадрата со стороной "+ l + " = " + s);


        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами "+ a  + " и " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
