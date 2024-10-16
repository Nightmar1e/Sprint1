package TascaS101HerènciaiPolimorfisme.Lvl1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Accessing WindInstrument class without creating an instance.");
        WindInstrument.staticMethod();

        System.out.println("\nCreating an instance of StringInstrument:");
        Instrument stringInstrument = new StringInstrument("Violin");
        stringInstrument.play();

        System.out.println("\nCreating an instance of PercussionInstrument:");
        Instrument percussionInstrument = new PercussionInstrument("Drum");
        percussionInstrument.play();
    }
}
