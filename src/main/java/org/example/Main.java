package org.example;

import java.util.ArrayList;

public class Main {
    private static Accounts accounts = new Accounts();
    private static Prompter prompter = new Prompter();
    public static void main(String[] args) {
        System.out.println("Welcome Admin!");

        while (true) {
            System.out.println("--------------------------");
            System.out.println("Main menu\n1 for Enrolling Students\n2 for Payment for tuition\n3 for exit");
            int choice = prompter.promptInputInt("Please enter a key (1-3): ", 1, 3);
            if (choice == 1) {
                enrollStudents();
            } else if (choice == 2) {
                payTuition();
            } else {
                break;
            }
        }
    }

    public static void payTuition() {
        while (true) {
            String accountId = prompter.promptInputString("0 to exit. Please enter Student ID: ");
            Account acc = accounts.findAccount(accountId);
            if (accountId.equals("0")) {
                break;
            }

            if (acc == null) {
                System.out.println("No Student ID found. Please try again.");
            }
            else {
                float payment = prompter.promptInputFloat("Please enter your payment: ", 1, 0);
                acc.payTuition(payment);
                System.out.println("Successfully paid");
                System.out.println("Account status");
                acc.checkStatus();
                break;
            }
        }
    }

    public static void enrollStudents() {
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