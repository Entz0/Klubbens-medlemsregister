import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int medlemsnummer){
        Medlem medlem = new Medlem(namn, medlemsnummer);
        medlemmar.add(medlem);
    }

}