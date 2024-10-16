package TascaS101HerènciaiPolimorfisme.Lvl1;

class StringInstrument extends Instrument {
    static {
        System.out.println("StringInstrument class loaded.");
    }

    public StringInstrument(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
