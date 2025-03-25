public class main {
    public static void main(String[] args) {
        PercussionInstrument p1= new PercussionInstrument("Gretsch Catalina",500.00);
        StringInstrument s1= new StringInstrument("Fender Telecaster", 1200.00);
        WindInstrument w1= new WindInstrument("Fagot", 800.00);

        p1.playInstrument();
        s1.playInstrument();
        w1.playInstrument();
    }
}
