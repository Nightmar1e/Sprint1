package TascaS101HerènciaiPolimorfisme.cottxe;

class Car {
    public static final String marca = "Toyota";
    public static String model = "Corolla";
    public final int potencia;

    public Car(int potencia) {
        this.potencia = potencia;
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant.");
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Marca del Car (static final): " + Car.marca);

        System.out.println("Model del Car (static): " + Car.model);

        Car Car1 = new Car(120);
        System.out.println("Potència del Car 1 (final): " + Car1.potencia);

        Car.model = "Camry";

        Car Car2 = new Car(150);
        System.out.println("Potència del Car 2 (final): " + Car2.potencia);

        System.out.println("Model del Car (static): " + Car.model);

        Car1.accelerar();
        Car.frenar();
    }
}
