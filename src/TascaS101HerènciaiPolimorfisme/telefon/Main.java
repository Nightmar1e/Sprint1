package TascaS101HerènciaiPolimorfisme.telefon;

// Telèfon class
class Telefon {
    // Attributes
    protected String marca;
    protected String model;

    // Constructor
    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    // Method to simulate a call
    public void trucar(String numero) {
        System.out.println("S’està trucant al número: " + numero);
    }
}

// Camera interface
interface Camera {
    void fotografiar();
}

// Rellotge interface
interface Rellotge {
    void alarma();
}

// Smartphone class that extends Telefon and implements Camera and Rellotge
class Smartphone extends Telefon implements Camera, Rellotge {

    // Constructor
    public Smartphone(String marca, String model) {
        super(marca, model);  // Calling the constructor of the Telefon class
    }

    // Implementing the fotografiar method from Camera interface
    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto.");
    }

    // Implementing the alarma method from Rellotge interface
    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Smartphone object
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        // Calling the trucar method from the Telefon class
        smartphone.trucar("123456789");

        // Calling the fotografiar method from the Camera interface
        smartphone.fotografiar();

        // Calling the alarma method from the Rellotge interface
        smartphone.alarma();
    }
}
