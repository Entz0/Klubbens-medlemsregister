import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int medlemsnummer){
        Medlem medlem = new Medlem(namn, medlemsnummer);
        medlemmar.add(medlem);
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

}