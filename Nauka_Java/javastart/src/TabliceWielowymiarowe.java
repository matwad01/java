import java.util.Arrays;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
/*        int tablica[][] = new int[5][5];

        for (int i = 0; i<tablica.length; i++){
            for (int j = 0; j<tablica.length; j++) {
                tablica[i][j] = 0;
            }
        }*/

        int[] a = {1,2,3};
        int[] b = {1,2,3};

        if (Arrays.equals(a, b)) {
            System.out.println(Arrays.toString(a));
        }



    }
}
