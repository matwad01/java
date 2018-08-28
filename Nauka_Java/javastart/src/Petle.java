import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
/*      int licznik = 0;

        while (licznik < 10) {
            System.out.println("To jest petla");
            licznik++;*/

/*      int licznik = 0;
        do {
            System.out.println("To jest petla");
            licznik++;
        }
        while (licznik<10);
        System.out.println("Koniec petli");*/

/*      for (int i = 0; i<10; i++){
            System.out.println("To jest petla");
        }
        System.out.println("Koniec petli");*/

//Napisz program który pobierz od użytkownika całkowitą liczbę dodatnią.
// Następnie wyświetl na ekranie odiczanie z tekstem bomba wybuchnie za... ,
// gdzie w miejsce dwukropka mają pojawić się liczby od podanej przez użytkownika do 0.
// Napisz program w 3 wersjach przy użyciu 3 pętli.

        int liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        //liczba = scanner.nextInt();


       /* while (liczba > 0) {
            System.out.println("Bomba wybuchnie za " + liczba + " sekund");
            liczba--;
        }l
        System.out.println("Bomba jebła");*/

/*       do {
           System.out.println("Bomba wybuchnie za " + liczba + " sekund");
           liczba--;
       }
       while (liczba > 0);
            System.out.println("Bomba jebła");*/

        for (liczba = scanner.nextInt(); liczba > 0; liczba--){
            System.out.println("Bomba wybuchnie za " + liczba);

        }
        System.out.println("Bomba jebła");

    }
}

