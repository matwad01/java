import java.io.*;

public class BinarnyZapisOdczyt {
    public static void main(String[] args) throws FileNotFoundException {
        String plik = "binarnie.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(plik);
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(plik));


    }
}
