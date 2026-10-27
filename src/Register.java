import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public String addMedlem(String namn, int medlemsnummer){

        if (namn.isBlank()) {
            return "Medlem kan inte vara tomt!";
        }

        if (namn.trim().matches("[0-9]+")) {
            return "Namnet får inte bara innehålla siffror!";
        }

        if(medlemsnummer <= 0){
            return "Medlemsnummer måste vara positivt";
        }

        Medlem medlem = new Medlem(namn, medlemsnummer);
        medlemmar.add(medlem);
        return "Medlem har lagts till";

    }

    public void printAllMedlems(){
        if (medlemmar.isEmpty()) {
            System.out.println("Medlemmar saknas");
            return;
        }
        System.out.println("Alla medlemmar: ");

        for(Medlem medlem : medlemmar){
            System.out.println("Medlem: " + medlem.getNamn() + " | ID: " + medlem.getMedlemsnummer());
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