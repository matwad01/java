import java.util.Scanner;

public class InstrukcjeSterujace{
    public static void main(String[] args) {
/*        int zmienna = 5;
        if(zmienna%2 == 0)
            System.out.println("Liczba parzysta");
        else
            System.out.println("Liczba nieparzysta");

        if(zmienna>10)
            System.out.println("Liczba większa od 10");
        else if(zmienna>0 && zmienna<=10)
            System.out.println("Liczba dodatnia mniejsza, lub równa 10");
        else
            System.out.println("Liczba ujemna");

        int zmienna = 3;

        switch(zmienna){
            case 1:
                System.out.println("Liczba to 1");
                break;
            case 2:
                System.out.println("Liczba to 2");
                break;
            default:
                System.out.println("Liczba to ani 1, ani 2");
        }*/

//Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.

/*        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe calkowita");
        a = scanner.nextInt();
        System.out.println("Podaj druga liczbe calkowita");
        b = scanner.nextInt();

        if (a==b) {
            System.out.println("Obie liczby są równe");
        }
        else if (a>b) {
            System.out.println("a jest wieksze od b");
        }
        else if (a<b) {
            System.out.println("a jest mniejsze od b");
        }*/

// Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. Następnie stwórz kilka warunków z różnymi imionami.
// Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".


        String imie;
        Scanner scanner = new Scanner(System.in);
        imie = scanner.next();

        switch (imie){
            case "Janusz":
                System.out.println("Nie znam Cie");
                break;
            case "Grażyna":
                System.out.println("Nie znam Cie");
                break;
            case "Brajan":
                System.out.println("Nie znam Cie");
                break;
            case "Dżessika":
                System.out.println("Nie znam Cie");
                break;
            case "Mateusz":
                System.out.println("Witaj kierowniku");
                break;
            default:
                System.out.println("Nie wiem co do mnie mówisz człowieku");
        }


    }
}
