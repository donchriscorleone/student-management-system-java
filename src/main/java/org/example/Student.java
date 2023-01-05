package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class Student {
    private static AtomicLong uniqueCounter = new AtomicLong();
    private String id;
    private String firstName;
    private String lastName;
    private int gradeLevel;

    public Student(String firstName, String lastName, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.id = this.generateUniqueId();
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
        StringBuilder builder = new StringBuilder();

        long count = Student.uniqueCounter.incrementAndGet();
        String first = this.gradeLevel < 10 ? "0" + this.gradeLevel : Integer.toString(this.gradeLevel);
        String second = count < 10 ? "00" + count : "0" + count;

        builder.append(first);
        builder.append(second);
        return builder.toString();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nName: " + this.lastName + ", " + this.firstName + "\nGrade Level: " + this.gradeLevel;
    }
}
