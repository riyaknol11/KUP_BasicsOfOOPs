package com.knoldus.task2;

import com.knoldus.task1.MethodOverloading;

import java.util.Scanner;

public class MethodOverloadingImplementation {

     static void print(int number){
         System.out.println("The entered number is : " + number);
     }

     static void print(String name){
         System.out.println("The entered name is : " + name);
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = input.nextInt();
        System.out.println("Enter any name : ");
        String text = input.next();
        //Calling out function print of class MethodOverloadingImplementation
        MethodOverloadingImplementation.print(number);
        MethodOverloadingImplementation.print(text);

    }
}
