package TascaS101HerènciaiPolimorfisme.Lvl1;

class PercussionInstrument extends Instrument {
    static {
        System.out.println("PercussionInstrument class loaded.");
    }

    public PercussionInstrument(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
