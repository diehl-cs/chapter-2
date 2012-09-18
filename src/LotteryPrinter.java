import java.util.Random;

public class LotteryPrinter
{
    private static Random generator = new Random();

    public static void main(String[] args)
    {
        System.out.print("Your numbers:");
        for (int i = 0; i < 6; ++i)
            System.out.print(" " + (generator.nextInt(49) + 1));
    }
}
