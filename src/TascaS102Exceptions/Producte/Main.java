package TascaS102Exceptions.Producte;

import java.util.ArrayList;
import java.util.List;

// Producte class
class Producte {
    // Attributes
    private String nom;
    private double preu;

    // Constructor
    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }
}

// Custom Exception VendaBuidaException
class VendaBuidaException extends Exception {
    // Constructor with a message
    public VendaBuidaException(String message) {
        super(message);
    }
}

// Venda class
class Venda {
    // Attributes
    private List<Producte> productes;
    private double preuTotal;

    // Constructor
    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

    // Method to add a product
    public void afegirProducte(Producte producte) {
        this.productes.add(producte);
    }

    // Method to calculate the total price of the sale
    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }

        preuTotal = 0.0;  // Resetting the total price
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
        System.out.println("El preu total de la venda és: " + preuTotal + " euros.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Venda object
        Venda venda = new Venda();

        try {
            // Trying to calculate total without adding products
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            // Catching and printing the custom exception message
            System.out.println(e.getMessage());
        }

        // Adding products to the sale
        Producte p1 = new Producte("Ordinador", 1200.50);
        Producte p2 = new Producte("Smartphone", 799.99);

        venda.afegirProducte(p1);
        venda.afegirProducte(p2);

        try {
            // Now calculating the total with products added
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        // Demonstrating how to catch an IndexOutOfBoundsException
        List<String> llista = new ArrayList<>();
        llista.add("Element 1");

        try {
            // Attempting to access an element at an invalid index
            System.out.println(llista.get(5));  // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            // Catching and printing the exception
            System.out.println("S'ha capturat una IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
