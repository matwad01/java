public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int tablica[][] = new int[5][5];

        for (int i = 0; i<tablica.length; i++){
            for (int j = 0; j<tablica.length; j++) {
                tablica[i][j] = 0;
            }
        }
    }
}
