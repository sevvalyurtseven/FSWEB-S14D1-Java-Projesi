package com.workintech.developer;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.MID.getSalary());
        System.out.println(getName() + " Mid Developer starts to working");
    }
}
