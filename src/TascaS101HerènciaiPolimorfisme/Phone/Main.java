package TascaS101HerènciaiPolimorfisme.Phone;

class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Calling the number: " + number);
    }
}

interface Camera {
    void takePhoto();
}

interface Clock {
    void alarm();
}

class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo.");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        smartphone.call("123456789");

        smartphone.takePhoto();

        smartphone.alarm();
    }
}
