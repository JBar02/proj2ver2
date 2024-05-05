import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static int displayMenuAndGetChoice() {
        System.out.println("\nWybierz opcję:");
        System.out.println("1. Przeprowadź algorytm Prima");
        System.out.println("2. Przeprowadź algorytm Kruskala");
        System.out.println("3. Wyjście");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        return choice;
    }
}