package com.techelevator;

import java.util.Scanner;

public class Application {

    /**
     * The main entry point in the application
     * Scenario: You are a Database Administrator for a university and need to create
     * an application to manage student enrollments and balance.
     * <p>
     * Your application should do the following:
     * Ask the user how many new students will be added to the database
     * Need to be able to handle an unknown number of objects we will be creating
     * The user should be prompted to enter the name and year for each student
     * The student should have a 5-digit unique ID, with the first number being their grade level
     * A student can enroll in the following courses: History 101, Math 101, Eng 101, Chemistry 101, CS 101
     * Each course costs $600 to enroll
     * The student should be able to view their balance and pay the tuition
     * <p>
     * To see the status of the student, we should see their name, ID, courses enrolled,balance
     */
    public static void main(String[] args) {

        //Ask user how many students to add?
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        //Create an array of users of that size
        Student[] students = new Student[numOfStudents];
        for (int i = 0; i < students.length;i++){
            students[i] = new Student();
            students[i].enrollCourse();
            students[i].payTuition();
            System.out.println(students[i].studentInfo());
        }


    }
}

