package org.example;

import java.util.HashMap;

public class Account {
    private Student student;
    private HashMap<String, ICourse> courses;
    private float balance;

    public Account(Student student) {
        this.student = student;
        this.courses = new HashMap<>();
    }

    public void addCourse(ICourse course) {
        if (this.courses.containsKey(course.getName())) {
            System.out.println("Course is already enrolled.");
        }
        else {
            this.courses.put(course.getName(), course);
            this.balance += course.getPrice();
        }
    }

    public void payTuition(float payment) {
        if (balance <= 0) {
            System.out.println("Student is already fully paid.");
        }

        else {
            balance -= payment;
        }
    }

    public void checkStatus() {
        System.out.println("Student ID: " + this.student.getId());
        System.out.println("Student Name: " + this.student.getFirstName() + " " + this.student.getLastName());
        System.out.println("Courses enrolled: ");
        this.courses.entrySet().forEach((set) -> System.out.println(set.getValue().getName()));
        System.out.println("Balance: " + this.balance);
    }
}
