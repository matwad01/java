//Napisz klase pracownik, która przechowuje trzy pola : imie, nazwisko, wiek.
//Nastepnie utworz klase firma, w której wykorzystasz klase pracownik do utworzenia dwóch obiektów
//przechowujących dane pracowników i później wyświetlasz je na ekran

/*public class Firma {
    public static void main(String[] args) {
        Pracownik hydraulik = new Pracownik();

        hydraulik.imie = "Janusz";
        hydraulik.nazwisko = "Tracz";
        hydraulik.wiek = 45;

        Pracownik sprzedawca = new Pracownik();
        sprzedawca.imie = "Brajan";
        sprzedawca.nazwisko = "Moczyk";
        sprzedawca.wiek = 22;

        System.out.println(hydraulik.imie + " " + hydraulik.nazwisko + " " + hydraulik.wiek);
        System.out.println(sprzedawca.imie + " " + sprzedawca.nazwisko + " " + sprzedawca.wiek);

    }
}*/

class Pracownik {
    String imie, nazwisko;
    int wiek;
}


//Inna wersja powiększona o 3 pracowników z tablicami

public class Firma {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[3];
        String imiona[] = {"Janusz", "Andrzej", "Brajan"};
        String nazwiska[] = {"Tracz", "Bolek", "Dalosz"};
        int wiek[] = {45, 50, 20};

        for (int i = 0; i < pracownicy.length; i++) {
            pracownicy[i] = new Pracownik();
            pracownicy[i].imie = imiona[i];
            pracownicy[i].nazwisko = nazwiska[i];
            pracownicy[i].wiek = wiek[i];
        }
        System.out.println("Pracownicy firmy to ");
        for (int i = 0; i<pracownicy.length; i++) {
            System.out.println(pracownicy[i].imie + " " + pracownicy[i].nazwisko + " " + pracownicy[i].wiek);
        }
    }
}