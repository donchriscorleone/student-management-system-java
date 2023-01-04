package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class Student {
    private static AtomicLong unique = new AtomicLong();
    private static Long uniqueCount;
    private String id;
    private String firstName;
    private String lastName;
    private int gradeLevel;

    public Student(String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    private String generateUniqueId() {
        Student.uniqueCount = Student.unique.incrementAndGet();
//      5-digit ID - first number is their grade level
        return "";
    }
}
