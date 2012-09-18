import java.util.Random;
import java.util.Scanner;

public class DiceRoller
{
    private static Scanner scanner = new Scanner(System.in);
    private static Random generator = new Random();

    public static void main(String[] args)
    {
        String in = "";
        while (!in.trim().toLowerCase().startsWith("q"))
        {
            System.out.println("Result: " + (generator.nextInt(6) + 1));

            System.out.print("Press Enter to roll again, or Q then Enter to quit... ");
            in = scanner.nextLine();
            System.out.println();
        }
    }
}
