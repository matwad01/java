public class Objekt {
    double x;
    double y;
}

class Test1 {
    static void zmien(Objekt objekt){
        Math.sqrt(objekt.x);
        Math.sqrt(objekt.y);

    }
}

class Glowna {

    public static void main(String args[]){
        Objekt objekt = new Objekt();
        objekt.x = 100;
        objekt.y = 100;

        Test1.zmien(objekt);

        System.out.println("Współrzędne to: "+objekt.x+" "+objekt.y);
    }
}
