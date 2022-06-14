import models.Car;

public class Constructors {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car = new Car("Audi", 1998, 85,true);
        System.out.println(car);
        car = new Car("Audi", "red", 1998, 85);
        System.out.println(car);
        car = new Car("Audi", "red",true);
        System.out.println(car);
        car = new Car("Audi", "red", 1998, 85, true);
        System.out.println(car);


    }
}

