//Napisz klase pracownik, która przechowuje trzy pola : imie, nazwisko, wiek.
//Nastepnie utworz klase firma, w której wykorzystasz klase pracownik do utworzenia dwóch obiektów
//przechowujących dane pracowników i później wyświetlasz je na ekran

public class Firma {
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
}

class Pracownik {
    String imie, nazwisko;
    int wiek;
}
