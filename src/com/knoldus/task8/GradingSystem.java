package com.knoldus.task8;

public class GradingSystem {
    public static void main(String args[])
    {
        StudentGrade student = new StudentGrade();
        student.setGrade('A');
        System.out.println("The grade of the given student is: "+ student.getGrade());
    }
}
