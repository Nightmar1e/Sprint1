package TascaS101HerènciaiPolimorfisme.Car;

class Car {
    public static final String brand = "Toyota";
    public static String model = "Corolla";
    public final int horsepower;

    public Car(int horsepower) {
        this.horsepower = horsepower;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Car brand: " + Car.brand + " (static final)");

        System.out.println("Car model: " + Car.model + " (static)");

        Car car1 = new Car(120);
        System.out.println("Car 1 horsepower: " + car1.horsepower + " (final)");

        Car.model = "Camry";

        Car car2 = new Car(150);
        System.out.println("Car 2 horsepower: " + car2.horsepower + " (final)");

        System.out.println("Car model: " + Car.model + " (static)");

        car1.accelerate();
        Car.brake();
    }
}
