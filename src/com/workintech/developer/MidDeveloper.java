package com.workintech.developer;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " Mid Developer starts to working");
    }
}
