package com.techelevator;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Student {

    //Class Variables (Encapsulation by making variables private)
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; // Value is true for all objects
    private static int id = 1000; //Why static? Value is true for all objects of Student

    //Class constructor: Prompt user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first name of each student: \n");
        this.firstName = sc.next();
        System.out.println("Please enter the last name of each student: \n");
        this.lastName = sc.next();
        System.out.println(" Please enter the student's grade year: \n 1 - Freshman\n 2 - Sophomore \n 3 - Junior \n 4 - Senior \n"
        );
        this.gradeYear = sc.nextInt();

        setStudentID();

    }


    //Generate an ID (5 Digit Unique, Starting with SchoolYear)
    private void setStudentID() {
        //Grade level + static id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll Student in courses
    public void enrollCourse() {
        //Get inside of a loop, user hits 0 when they are done enrolling
        do {
            System.out.println(" Enter the number for the appropriate course to enroll: " +
                    "\n 1 - History 101\n 2 - Math 101\n 3 - Eng 101" +
                    "\n 4 - Computer Science 101\n Q - Completed Enrolling");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
                // Add course cost to balance
            } else {
                break;
            }
        }
        while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("YOUR BALANCE IS: " + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("How much would you like to pay? " +
                        "Enter whole numbers only");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show Status
    public String studentInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " +gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nTuition Balance: " + tuitionBalance;
    }

}
