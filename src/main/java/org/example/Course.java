package org.example;

public class Course extends ICourse{

    public Course(String name, float price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getPrice();
    }
}
