import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public String addMedlem(String namn, int medlemsnummer){

        String error = validateMedlem(namn, medlemsnummer);

        if (error != null) {
            return error;
        }

        Medlem medlem = new Medlem(namn, medlemsnummer);
        medlemmar.add(medlem);
        return "Medlem har lagts till";
    }

    public String addPremiumMedlem(String namn, int medlemsnummer){
        String error = validateMedlem(namn, medlemsnummer);

        if (error != null) {
            return error;
        }

        PremiumMedlem pMedlem = new PremiumMedlem(namn, medlemsnummer);
        medlemmar.add(pMedlem);
        return "Premium-medlemmen har lagts till";
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

    private String validateMedlem(String namn, int medlemsnummer){
        if (namn.isBlank()) {
            return "Medlem kan inte vara tomt!";
        }

        if (namn.trim().matches("[0-9]+")) {
            return "Namnet får inte bara innehålla siffror!";
        }

        if(medlemsnummer <= 0){
            return "Medlemsnummer måste vara positivt";
        }

        for(Medlem m : medlemmar){
            if (m.getMedlemsnummer() == medlemsnummer){
                return "Medlemsnumret finns redan!";
            }
        }
        return null;
    }

}