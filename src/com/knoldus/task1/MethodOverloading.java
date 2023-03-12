package com.knoldus.task1;

import java.util.Scanner;

public class MethodOverloading {

    //add method taking 2 numbers as parameters
    static int add(int number1, int number2){
        return number1 + number2;
    }
    //add method taking 3 numbers as parameters
    static int add(int number1, int number2, int number3){
        return number1+number2+number3;
    }
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1 = input.nextInt();
        System.out.println("Enter number 2: ");
        number2 = input.nextInt();
        System.out.println("Enter number 3: ");
        number3 = input.nextInt();

        System.out.println("The result of addition of 2 numbers : "+ MethodOverloading.add(number1,number2));
        System.out.println("The result of addition of 3 numbers : "+ MethodOverloading.add(number1,number2,number3));

    }
}
