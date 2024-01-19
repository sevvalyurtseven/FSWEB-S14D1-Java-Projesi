package com.workintech.developer;

public class HRManager extends Employee {
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working");
    }
}
