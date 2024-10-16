package TascaS101HerènciaiPolimorfisme.Lvl1;

public abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();
}
