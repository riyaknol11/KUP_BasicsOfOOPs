package com.knoldus.task9;

//Methods for drawing different shapes are implemented using Polymorphism.
 class Shape {
    public void draw(){
        System.out.println("Drawing different shapes");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("method for drawing circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("method for drawing rectangle");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("method for drawing Triangle");
    }
}
class DrawShapes{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        circle1.draw();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();
        Triangle triangle1 = new Triangle();
        triangle1.draw();
    }
}