public class PetlaForEach {
    public static void main(String[] args) {
        int tablica[] = new int[10];
        for (int i = 0; i<tablica.length; i++) {
            tablica[i] = i + 1;
        }
        //Wyświetlanie zawartości tablicy przy pomocy etli for each
        for (int x: tablica) {
            System.out.println(x);
        }
    }
}
