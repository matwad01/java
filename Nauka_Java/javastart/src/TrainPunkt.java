/*Utwórz klasę Punkt, która przechowuje dwie wartości typu int (zmienilem na double zeby wyswietlalo random) - współrzędne punktu na powierzchni. Napisz w niej także metody które:

        zwiększają wybraną współrzędną o 1
        zmieniają wybraną zmienną o dowolną wartość
        zwracają wartość współrzędnych (oddzielne metody)
        wyświetla wartość współrzędnych
        Napisz także klasę, w której przetestujesz działanie metod wyświetlając działanie metod na ekranie*/

public class TrainPunkt {
    double a;
    double b;

}

class Change {
    static void increment(TrainPunkt trainPunkt) {
        trainPunkt.a++;
        trainPunkt.b++;
    }

    static void change (TrainPunkt trainPunkt) {
        trainPunkt.a = Math.random();
        trainPunkt.b = Math.random();
    }

    static void show (TrainPunkt trainPunkt) {
        System.out.println(trainPunkt.a);
        System.out.println(trainPunkt.b);
    }

}

class Check {
    public static void main(String[] args) {
        TrainPunkt trainPunkt = new TrainPunkt();
        trainPunkt.a = 10;
        trainPunkt.b = 100;

        Change.increment(trainPunkt);
        Change.change(trainPunkt);
        Change.show(trainPunkt);


    }
}