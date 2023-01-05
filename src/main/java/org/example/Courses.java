package org.example;

import java.util.HashMap;

public class Courses {
    private HashMap<Long, Course> listOfCourses;

    public Courses() {
        this.listOfCourses = new HashMap<>();
        populateList();
    }

    public HashMap<Long, Course> getListOfCourses() {
        return this.listOfCourses;
    }

    private void populateList() {
        this.addCourse("History 101", 600);
        this.addCourse("Mathematics 101", 600);
        this.addCourse("English 101", 600);
        this.addCourse("Chemistry 101", 600);
        this.addCourse("Computer Science 101", 600);
    }

//    Helper method
    private void addCourse(String courseName, float price) {
        Course course = new Course(courseName, price);
        this.listOfCourses.put(course.getId(), course);
    }
}
