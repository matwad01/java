/*Napisz program składający się z dwóch klas.
Pierwsza niech zawiera kilka metod o nazwie dodaj(), ale zwracających różne typy wyników i przyjmujących po minimum dwa parametry typów liczbowych wybranych przez Ciebie.
Ich zadaniem jest zwrócenie, lub wyświetlanie sumy podanych argumentów.
W drugiej klasie Testowej utwórz obiekt tej klasy i sprawdź działanie swoich metod, wyświetlając wyniki działań na ekranie.
Dodatkowo każda z metod niech wyświetla swój typ zwracany i rodzaj argumentów, abyś wiedział, która z nich zadziałała.*/

public class Przeciazanie {

    int dodaj(int a, int b) {
        return a + b;
    }

    double dodaj (double a, double b) {
        return a + b;
    }

}

class Testowa {
    public static void main(String[] args) {
        Przeciazanie przeciazanie = new Przeciazanie();
        System.out.println(przeciazanie.dodaj(10, 10));
        System.out.println(przeciazanie.dodaj(10.17, 46.47));
    }
}
