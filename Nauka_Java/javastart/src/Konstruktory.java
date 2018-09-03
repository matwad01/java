/*Napisz program, który będzie się składał z dwóch klas:

        -Pracownik - przechowująca takie dane jak imię, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory, które posłużą do inicjowania obiektów z różnymi parametrami
        - w przypadku gdy przykładowo konstruktor przyjmuje tylko 1 parametr, zainicjuj pozostałe pola jakimiś domyślnymi wartościami.

        -Frm - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i wyświetlisz dane na ekran.

        Mile widziane wykorzystanie tablic oraz pętli.*/


public class Konstruktory {
    String imie;
    String nazwisko;
    int wiek;

    public Konstruktory() {
        imie = "Nie_podano";
        nazwisko = "Nie_podano";
        wiek = -1;
    }

    public Konstruktory(String i, String n, int w) {
        imie = i;
        nazwisko = n;
        wiek = w;
    }

    public Konstruktory(Konstruktory prac) {
        imie = prac.imie;
        nazwisko = prac.nazwisko;
        wiek = prac.wiek;
    }
}

class Frm {
    public static void main(String[] args) {
        Konstruktory[] konstruktories = new Konstruktory[3];
        konstruktories[0] = new Konstruktory();
        konstruktories[1] = new Konstruktory("Janusz", "Tracz", 33);
        konstruktories[2] = new Konstruktory(konstruktories[1]);

        for(Konstruktory k: konstruktories)
            System.out.println("prac3: "+k.imie+" "+k.nazwisko+" "+k.wiek);

    }
}