package com.knoldus.task4;
import java.util.Scanner;
class Shape
{
    void area()
    {
        System.out.println("Calculating area of different shapes!");
    }
}
class Circle extends Shape{
    double radius;
    final double PI= 3.14;
    public Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("The area of circle is: "+ 3.14* radius* radius);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("The area of rectangle is: "+ length*breadth);
    }
}

public class MethodOverriding{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius for circle :");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        circle.area();
        System.out.println("Enter the length of Rectangle :");
        int length = input.nextInt();
        System.out.println("Enter the breadth of Rectangle :");
        int breadth = input.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.area();
    }
}

