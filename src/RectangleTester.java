import java.util.Scanner;

public class RectangleTester
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the width: ");
        int x = scanner.nextInt();

        System.out.print("Enter the height: ");
        int y = scanner.nextInt();

        System.out.printf("\nArea: %d\nPerimeter: %d\n",
                          x * y,
                          2 * (x + y));
    }
}
