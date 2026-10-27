import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();
        boolean kor = true;

        System.out.println("Välkommen till klubbens medlemsregister!");

        while (kor) {
            System.out.println();
            System.out.println("1. Lägg till medlem");
            System.out.println("2. Lägg till PREMIUM-medlem");
            System.out.println("3. Lista alla medlemmar");
            System.out.println("4. Sök medlem");
            System.out.println("5. Avsluta");
            System.out.print("Välj ett alternativ: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ange ett heltal.");
                scanner.nextLine();
                continue;
            }

            int val = scanner.nextInt();
            scanner.nextLine(); // Läs bort Enter efter talet.

            switch (val) {
                case 1 -> {
                    System.out.print("Namn: ");
                    String namn = scanner.nextLine();

                    System.out.print("Medlemsnummer: ");

                    if (scanner.hasNextInt()) {
                        int nummer = scanner.nextInt();
                        scanner.nextLine();

                        register.addMedlem(namn, nummer);
                        System.out.println("Medlemmen har lagts till.");
                    } else {
                        System.out.println("Medlemsnumret måste vara ett heltal.");
                        scanner.nextLine();
                    }
                }
                case 2 -> {
                    System.out.print("Namn (Premium): ");
                    String namn = scanner.nextLine();
                    System.out.print("Medlemsnummer: ");
                    if (scanner.hasNextInt()) {
                        int nummer = scanner.nextInt();
                        scanner.nextLine();
                        register.addPremiumMedlem(namn, nummer);
                        System.out.println("Premium-medlemmen har lagts till.");
                    } else {
                        System.out.println("Medlemsnumret måste vara ett heltal.");
                        scanner.nextLine();
                    }
                }
                case 3 -> register.printAllMedlems();

                case 4 -> {
                    System.out.print("Sök namn: ");
                    String namn = scanner.nextLine();

                    Medlem medlem = register.findMedlem(namn);

                    if (medlem != null) {
                        System.out.println(
                                medlem.getNamn() + " "
                                        + medlem.getMedlemsnummer()
                        );
                    } else {
                        System.out.println("Medlemmen saknas");
                    }
                }
                case 5 -> {
                    System.out.println("Programmet avslutas.");
                    kor = false;
                }
                default -> System.out.println("Ogiltigt val");
            }
        }

        scanner.close();
    }
}