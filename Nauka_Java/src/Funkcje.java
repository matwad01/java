import static java.lang.Math.*;

public class Funkcje{
    public static void main(String[] args){
        double liczba = 9.0;
        int b = 3;
        double pierwiastek = sqrt(liczba);
        double potega = pow(liczba, b);

        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
        System.out.println("Liczba "+liczba+" podniesiona do potegi "+b+" to "+potega);
    }
}