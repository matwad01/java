import java.util.Scanner;

public class WejWy {
    public static void main(String[] args) {
/*      String imie;
        Scanner scanner = new Scanner(System.in); // Pobieramy dane od użytkownika

        imie = scanner.nextLine();

        System.out.println("Witaj" + imie); // wyswietlamy powitanie*/

        double a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a i b");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        double sum = a+b;
        double dif = a-b;
        double div = a/b;
        double mno = a*b;

        System.out.println("Wynik dodawania to " + sum +
                            "\nWynik odejmowania to " + dif +
                            "\n Wynik dzielenia to " + div +
                            "\nWynik mnożenia to " + mno);

    }
}
