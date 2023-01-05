package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class Course extends ICourse {
    private static AtomicLong counter = new AtomicLong();
    private Long id;

    public Course(String name, float price) {
        super(name, price);
        this.id = Course.counter.incrementAndGet();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            return this.getName().matches(((Course) obj).getName());
        }
        return super.equals(obj);
    }
}
