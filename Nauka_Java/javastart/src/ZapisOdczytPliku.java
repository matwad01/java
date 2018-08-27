import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ZapisOdczytPliku {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");
        Scanner scanner = new Scanner(file);

        String zdanie = scanner.nextLine();
        System.out.println(zdanie);
    }
}
