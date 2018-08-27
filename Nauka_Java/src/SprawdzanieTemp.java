public class SprawdzanieTemp {

    public static void main(String[] args) {

        int tempDodatnia = 20;
        int tempUjemna = -20;

        isPositiveTemp(tempDodatnia);
        isPositiveTemp(tempUjemna);


    }

    private static boolean isPositiveTemp(int temp) {
        boolean isPositive = temp > 0;

        if (isPositive) {
            System.out.println("Temperatura jest dodatnia");
        }

        else {
            System.out.println("Temperatura jest ujemna");
        }

        return isPositive;
    }

}

