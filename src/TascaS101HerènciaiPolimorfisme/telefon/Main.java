package TascaS101HerènciaiPolimorfisme.telefon;

class Telefon {
    protected String marca;
    protected String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numero) {
        System.out.println("S’està trucant al número: " + numero);
    }
}

interface Camera {
    void fotografiar();
}

interface Rellotge {
    void alarma();
}

class Smartphone extends Telefon implements Camera, Rellotge {

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto.");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma.");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        smartphone.trucar("123456789");

        smartphone.fotografiar();

        smartphone.alarma();
    }
}
