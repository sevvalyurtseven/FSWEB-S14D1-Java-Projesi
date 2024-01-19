package com.workintech.developer;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.HRMANAGER.getSalary());
        System.out.println(getName() + " HR Manager starts to working");
    }
}
