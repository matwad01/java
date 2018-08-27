public class Main
{
    public static void main(String[] args)
    {
        int positiveTemperature = 10;
        int negativeTemperature = -10;

        isTemperaturePositive(positiveTemperature);
        isTemperaturePositive(negativeTemperature);
    }

    private static boolean isTemperaturePositive(double temperature) {
        boolean isPositive = temperature > 0;

        if (isPositive) {
            System.out.println("Temperatura " + temperature + " jest dodatnia.");
        }
        else {
            System.out.println("Temperatura " + temperature + " nie jest dodatnia.");
        }

        return isPositive;

    }

}
