import java.math.BigInteger;

public class kalkulator {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("-123123123123123123123123123123");
        BigInteger b = new BigInteger("321321321321321321321321321321");
        System.out.println("a+b= "+a.add(b).toString());
        System.out.println("a-b= "+a.subtract(b).toString());
        System.out.println("a*b= "+a.multiply(b).toString());
        System.out.println("a/b= "+a.divide(b).toString());

        System.out.println("a^12= "+a.pow(12));
        System.out.println("|a|= "+a.abs());
    }
}
