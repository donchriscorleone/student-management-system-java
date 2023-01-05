package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Prompter {
    private Scanner scanner;
    private Courses courses;

    public Prompter() {
        this.scanner = new Scanner(System.in);
        this.courses = new Courses();
    }

    public int numberOfNewStudents() {
        return this.promptInputInt("Enter a number (1-10): ");
    }

    public Student addNewStudent() {
        String firstName = this.promptInputString("Enter your first name: ");
        String lastName = this.promptInputString("Enter your last name: ");
        int gradeLevel = this.promptInputInt("Enter grade level (1-10): ");

        return new Student(firstName, lastName, gradeLevel);
    }

    public Course[] chooseCourses() {
        var ids = new ArrayList<Course>();
        var courses = this.courses.getListOfCourses();

        while (true) {
            System.out.println("Please enter the following number to choose some courses.");
            courses.entrySet().forEach(keyset -> {
                if (!ids.contains(keyset.getValue())) {
                    System.out.println(keyset.getKey() + " for " + keyset.getValue());
                }
            });
            System.out.println("-1 for exit.");

            Long key = this.scanner.nextLong();
            Course chosenCourse = courses.get(key);
            if (key == -1) return ids.toArray(new Course[ids.size()]);
            else if (chosenCourse != null && !ids.contains(chosenCourse)) {
                ids.add(courses.get(key));
            }
        }
    }

    private String promptInputString(String inputMessage) {
        while (true) {
            System.out.print(inputMessage);
            String input = this.scanner.nextLine();
            if (!input.isEmpty()) return input;
        }
    }

    private int promptInputInt(String inputMessage) {
        while (true) {
            System.out.print(inputMessage);
            int input = this.scanner.nextInt();
            this.scanner.nextLine();
            if (input > 0 && input < 11) return input;
        }
    }

}
