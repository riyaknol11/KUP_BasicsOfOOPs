package com.knoldus.task3;

class Animal{
     void speak(){
        System.out.println("This is the speak method of Super class.");
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("The speak method of Dog class");
    }
}

class Cat extends Animal{
    public void speak(){
        System.out.println("The speak method of Cat class");
    }
}


public class MethodOverridingImplementation {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.speak();
        dog.speak();
        cat.speak();

    }
}
