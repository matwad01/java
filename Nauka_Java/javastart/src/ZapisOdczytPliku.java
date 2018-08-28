import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ZapisOdczytPliku {
    public static void main(String[] args) throws FileNotFoundException {
/*      File file = new File("test.txt");
        Scanner scanner = new Scanner(file);

        String zdanie = scanner.nextLine();
        System.out.println(zdanie);

        PrintWriter printWriter = new PrintWriter("test2.txt");
        printWriter.println("Dupa123");
        printWriter.close();*/

        // Program w którym wprowadzisz w konsoli swoje imie, nastepnie zapiszesz
        // je do pliku. Odczytaj je z powrotem z pliku bez uzycia dodatkowej zmiennej
        // wyswietl na ekranie.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String imie;
        imie = scanner.nextLine();

        PrintWriter printWriter = new PrintWriter("imie2.txt");
        printWriter.println(imie);
        printWriter.close();

        Scanner scanner1 = new Scanner(new File("imie2.txt"));
        System.out.println(scanner1.nextLine());

    }
}
