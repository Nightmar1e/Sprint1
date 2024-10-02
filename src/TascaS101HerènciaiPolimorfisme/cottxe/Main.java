package TascaS101HerènciaiPolimorfisme.cottxe;

class Cotxe {
    // Attributes
    public static final String marca = "Toyota";  // Static and final attribute (constant for all instances)
    public static String model = "Corolla";       // Static attribute (shared by all instances but can be modified)
    public final int potencia;                    // Final attribute (constant for each instance, set in constructor)

    // Constructor to initialize the final attribute
    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    // Non-static method
    public void accelerar() {
        System.out.println("El vehicle està accelerant.");
    }

    // Static method
    public static void frenar() {
        System.out.println("El vehicle està frenant.");
    }
}

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        // Demonstrating the static final attribute
        System.out.println("Marca del cotxe (static final): " + Cotxe.marca); // Always the same

        // Demonstrating the static attribute
        System.out.println("Model del cotxe (static): " + Cotxe.model);  // Shared between all instances

        // Creating an instance of Cotxe
        Cotxe cotxe1 = new Cotxe(120);
        System.out.println("Potència del cotxe 1 (final): " + cotxe1.potencia);  // Can only be set at construction

        // Changing the static attribute
        Cotxe.model = "Camry";  // Modifies the shared model for all instances

        // Creating another instance of Cotxe
        Cotxe cotxe2 = new Cotxe(150);
        System.out.println("Potència del cotxe 2 (final): " + cotxe2.potencia);

        // Notice the static attribute has changed for all instances
        System.out.println("Model del cotxe (static): " + Cotxe.model);

        // Demonstrating method calls
        cotxe1.accelerar();  // Non-static method requires an instance
        Cotxe.frenar();      // Static method can be called directly from the class
    }
}
