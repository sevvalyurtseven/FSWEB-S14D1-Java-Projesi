import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developer.HRManager;
import com.workintech.developer.JuniorDeveloper;
import com.workintech.developer.MidDeveloper;
import com.workintech.developer.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        //SILINDIR ICIN:

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        //HAVUZUN ALANI ICIN:

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        //DEVELOPER COMPANY ICIN:

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Sevval");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Ozge");

        juniorDeveloper1.work();
        juniorDeveloper2.work();

        System.out.println(juniorDeveloper1);
        System.out.println(juniorDeveloper2);

        MidDeveloper midDeveloper = new MidDeveloper(1, "Alptug");

        midDeveloper.work();

        System.out.println(midDeveloper);

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1, "Fatih");

        seniorDeveloper.work();
        System.out.println(seniorDeveloper);

        HRManager hrManager = new HRManager(1, "Gokhan", new JuniorDeveloper[5],
                new MidDeveloper[2], new SeniorDeveloper[1]);

        hrManager.work();
        System.out.println(hrManager);
        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        hrManager.addEmployee(0, midDeveloper);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println(hrManager);
    }
}