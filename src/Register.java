import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int medlemsnummer){
        Medlem medlem = new Medlem(namn, medlemsnummer);
        medlemmar.add(medlem);
    }

    public void addPremiumMedlem(String namn, int medlemsnummer){
        PremiumMedlem pMedlem = new PremiumMedlem(namn, medlemsnummer);
        medlemmar.add(pMedlem);
    }

    public void printAllMedlems(){
        if (medlemmar.isEmpty()) {
            System.out.println("Medlemmar saknas");
            return;
        }
        System.out.println("Alla medlemmar: ");

        for(Medlem medlem : medlemmar){
            System.out.println(medlem.toString());
        }
    }

    public Medlem findMedlem(String namn){
        for (Medlem medlem : medlemmar) {
            if (medlem.getNamn().equalsIgnoreCase(namn)) {
                return medlem;
            }
        }
        return null;
    }

    public boolean removeMedlem(int medlemsnummer){
        for (Medlem medlem : medlemmar) {
            if (medlem.getMedlemsnummer() == medlemsnummer) {
                medlemmar.remove(medlem);
                return true;
            }
        }
        return false;
    }

}