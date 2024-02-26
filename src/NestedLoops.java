public class NestedLoops
{
    public static void main(String[] args)
    {
        for (int x = 1; x <= 5; x++) //will print 5 rows
        {
            for (int y = 1; y <= x; y++) // repeats loop one more time for each row
            {
                System.out.print("*"); // prints an *
            }
            System.out.println(); // starts a new line
        }
        System.out.println(); // improves output format

        for (int x = 1; x <= 5; x++) {
            for (int y = 5; y >= x; y--) // repeats loop one less time for each row
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int x = 1; x <= 5; x++)
        {
                for (int y = 1; y <= 5; y++) // repeats the loop the same amount of times for each row
                {
                    System.out.print("*");
                }
                System.out.println();
        }

    }
}
