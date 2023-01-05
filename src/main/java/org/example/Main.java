package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var accounts = new Accounts();
        var prompter = new Prompter();

        System.out.println("Hello, Admin. Please input how many students will be added: ");
        int numOfStudents = prompter.numberOfNewStudents();
        for (int i = 0; i < numOfStudents; i++) {
            var student = prompter.addNewStudent();
            var courses = prompter.chooseCourses();
            accounts.enrollAccount(student, courses);
        }

        for (var account: accounts.getAccounts()) {
            account.checkStatus();
            System.out.println("-----------------------");
        }
    }
}