/**
 * Program ten wyświetla wiadomość powitalną od autorów.
 * @version 1.20 2004-02-28
 * @author Cay Horstmann
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String[] greeting = new String[3];
        greeting[0] = "Witaj, czytelniku!";
        greeting[1] = "Pozdrowienia od Caya Horstmanna";
        greeting[2] = "i Gary'ego Cornella";
        for (String g : greeting)
            System.out.println(g);
    }
}