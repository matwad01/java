class Worker {
    String imie;
    String nazwisko;
    int wyplata;

    public Worker() {
        imie = "";
        nazwisko = "";
        wyplata = 0;
    }

    public Worker(String i, String n, int w) {
        imie = i;
        nazwisko = n;
        wyplata = w;
    }
}

class Boss extends Worker {
    int premia;
}

public class Company {
    public static void main(String[] args) {
        Worker prac = new Worker("Janusz", "Tracz", 2000);

        System.out.println("imie " + prac.imie);
        System.out.println("nazwisko " + prac.nazwisko);
        System.out.println("wyplata " + prac.wyplata);

        //najpierw stwórzmy obiekt klasy Szef korzystając z domyślnego konstruktora
        Boss boss = new Boss();

        //zobaczmy jak wyglądają odpowiednie pola
        System.out.println("Imię: "+ boss.imie);
        System.out.println("Nazwisko: "+ boss.nazwisko);
        System.out.println("Wypłata: "+ boss.wyplata);
        System.out.println("Premia: "+ boss.premia+"\n");

        //teraz ustawiamy dane szefa
        boss.imie = "Tadeusz";
        boss.nazwisko = "Kowalski";
        boss.wyplata = 10000;
        boss.premia = 2000;
        System.out.println("Imię: "+boss.imie);
        System.out.println("Nazwisko: "+boss.nazwisko);
        System.out.println("Wypłata: "+boss.wyplata);
        System.out.println("Premia: "+boss.premia);

    }
}