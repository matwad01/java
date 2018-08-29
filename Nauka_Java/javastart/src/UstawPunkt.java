public class UstawPunkt {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.wspX = 10;
        punkt.wspY = 20;
        System.out.println("Współrzędne punktu to " + punkt.wspY + " i " + punkt.wspX );

    }
}

class Punkt {
    int wspX;
    int wspY;
}
