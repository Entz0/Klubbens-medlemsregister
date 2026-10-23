import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = "";

        System.out.println("Välkommen till klubbens medlemsregister!");

        while (!val.equals("4")) {
            System.out.println();
            System.out.println("1. Lägg till medlem");
            System.out.println("2. Lista alla medlemmar");
            System.out.println("3. Sök medlem");
            System.out.println("4. Avsluta");
            System.out.print("Välj ett alternativ: ");

            val = scanner.nextLine().trim();

            switch (val) {
                case "1" -> {
                    // Här kopplar vi senare in Register.
                }
                case "2" -> {
                    // Här kopplar vi senare in Register.
                }
                case "3" -> {
                    // Här kopplar vi senare in Register.
                }
                case "4" -> System.out.println("Programmet avslutas.");
                default -> System.out.println("Ogiltigt val. Ange 1, 2, 3 eller 4.");
            }
        }

        scanner.close();
    }
}