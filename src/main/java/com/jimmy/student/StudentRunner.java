package com.jimmy.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student stu = new Student("Jimmy",
                97, 10);
        Student stu2 = new Student("Eric",
                60, 40);
        Student stu3 = new Student( "Jane",
                30, 55);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score:" + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english score:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math score:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
