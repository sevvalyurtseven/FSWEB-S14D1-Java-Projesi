package com.workintech.developer;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, String name, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }


    // NOOOOOT:
    // Eger juniorDevelopers'da gonderdigim index degeri null ise mevcut array'de bu kişi yoksa,
    // o index'e juniorDeveloper'i ekle. Array'in indexinin size'i belli oldugundan örnegin
    // 10 elemanlik bir array'e 15 gönderirsek ArrayIndexOutOfBoundsException hatasi aliriz.
    // Bu hatayı engellemek icin de try-catch blogu kullandık.

    // printStackTrace() == System.out.println()

    public void addEmployee (int index, JuniorDeveloper juniorDeveloper){
        try{
            if(juniorDevelopers[index] == null){
                juniorDevelopers[index] = juniorDeveloper;
        } else {
                System.out.println("Index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee (int index, MidDeveloper midDeveloper){
        try{
            if(midDevelopers[index] == null){
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("Index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee (int index, SeniorDeveloper seniorDeveloper){
        try{
            if(seniorDevelopers[index] == null){
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public void work() {
        setSalary(Salaries.HRMANAGER.getSalary());
        System.out.println(getName() + " HR Manager starts to working");
    }
}
