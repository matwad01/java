import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        //int tablica[] = new int[10]; Przkładowa inicjalizacja tablicy int 10-elementowej
        //typ tablica[] = {wartosc1, wartosc2, wartosc3}; inicjalizacja jezeli od razu znamy elementy

        //Wypelnienie tablicy kolejnymi liczbami calkowitymi do 1 do 10 i przypisanie jakiejś zmiennej wartosciz  komórki

/*        int tablica[] = new int[10];

        for (int i = 0; i<10; i++){
            tablica[i] = i+1;
        }

        for (int i = 0; i<10; i++){
            System.out.println("Kolejna komórka to " + tablica[i]);
        }*/

        //Napisz program w którym zadeklarujesz i utworzysz pięcioelementową tablicę
        //odpowiedniego typu. W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie powiadomienia
        //"Witaj imie_z_tablicy" dla każdego z podanych parametrów.

/*      String tablica[] = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<5; i++) {
            System.out.println("Podaj imie");
            tablica[i] = scanner.nextLine();
        }

        for (int i = 0; i<5; i++) {
            System.out.println("Witaj " + tablica[i]);
        }*/


        //Utwórz tablice typu int przechowującą n elementów, gdzie n - parametr pobierany od użytkownika.
        // Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Podaj wielkość tablicy ");
        n = scanner.nextInt();

        int tablica[]  = new int[n];

        for (int i = 0; i< tablica.length; i++) {
            tablica[i] = i+1;
        }
        int licznik = 0;
        while (licznik<tablica.length) {
            System.out.println(tablica[licznik]+"");
            licznik++;
        }
    }
}
