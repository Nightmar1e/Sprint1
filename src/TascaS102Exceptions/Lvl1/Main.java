package TascaS102Exceptions.Lvl1;

import java.util.ArrayList;
import java.util.List;

class Producte {
    private String nom;
    private double preu;

    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }
}

class VendaBuidaException extends Exception {
    public VendaBuidaException(String message) {
        super(message);
    }
}

class Venda {
    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

    public void afegirProducte(Producte producte) {
        this.productes.add(producte);
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }

        preuTotal = 0.0;
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
        System.out.println("El preu total de la venda és: " + preuTotal + " euros.");
    }
}

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        Producte p1 = new Producte("Ordinador", 1200.50);
        Producte p2 = new Producte("Smartphone", 799.99);

        venda.afegirProducte(p1);
        venda.afegirProducte(p2);

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        List<String> llista = new ArrayList<>();
        llista.add("Element 1");

        try {
            System.out.println(llista.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("S'ha capturat una IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
