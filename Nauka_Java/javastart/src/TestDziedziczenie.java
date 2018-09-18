/*Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej (współrzędne x oraz y). Zawierająca dwa konstruktory:
        bezparametrowy ustawiający pola na wartość 0, oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.

        Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).

        W klasie testowej utwórz obiekty obu klas i przetestuj działanie.*/

class Punkt2D {
    int x;
    int y;

    public Punkt2D() {
        x = 0;
        y = 0;
    }

    public Punkt2D(int wspx, int wspy) {
        x = wspx;
        y = wspy;
    }
}

public class TestDziedziczenie {
    public static void main(String[] args) {
        Punkt2D punkt2D = new Punkt2D(10,20);
        System.out.println("Punkt2D = " + punkt2D.x + punkt2D.y);

        Punkt3D punkt3D = new Punkt3D(100, 200,300);

        System.out.println("Punkt3D = " + punkt3D.x + punkt3D.y + punkt3D.z);
    }
}