public class PremiumMedlem extends Medlem {

    public PremiumMedlem(String namn, int medlemmsnummer) {
        super(namn, medlemmsnummer);
    }

    @Override
    public String toString() {
        return "[PREMIUM] Namn: " +getNamn() + " | ID: " + getMedlemsnummer();
    }
}
