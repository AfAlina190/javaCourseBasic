package testing.car;

public class Programme {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name   = "Ford";
        car1.color  = "Blue";
        car1.year   = 2000;
        System.out.println(car1.name);
        System.out.println(car1.color);
        System.out.println(car1.year);

        Car car2 = new Car();
        car2.name   = "BMW";
        car2.color  = "Gold";
        car2.year   = 600;
        System.out.println(car2.name);
        System.out.println(car2.color);
        System.out.println(car2.year);

        Car car3 = new Car();
        car3.name   = "Fd";
        car3.color  = "Be";
        car3.year   = 20;
        System.out.println(car3.name);
        System.out.println(car3.color);
        System.out.println(car3.year);
    }
}
