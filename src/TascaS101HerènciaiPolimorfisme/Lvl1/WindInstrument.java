package TascaS101HerènciaiPolimorfisme.Lvl1;

class WindInstrument extends Instrument {
    static {
        System.out.println("WindInstrument class loaded.");
    }

    public WindInstrument(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    public static void staticMethod() {
        System.out.println("WindInstrument static method called.");
    }
}

