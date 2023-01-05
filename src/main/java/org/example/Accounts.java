package org.example;

import java.util.ArrayList;

public class Accounts {
    private ArrayList<Account> accounts;

    public Accounts() {
        this.accounts = new ArrayList<>();
    }

    public void enrollAccount(Student student, Course[] courses) {
        var account = new Account(student);

        for (var course: courses)
            account.addCourse(course);

        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account findAccount(String studentId) {
        Account account = null;
        for (var acc: this.accounts) {
            if (acc.getStudent().getId().equals(studentId)) account = acc;
        }

        return account;
    }
}
