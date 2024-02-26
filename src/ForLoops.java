public class ForLoops
{
    public static void main(String[] args)
    {
        for(int x=0; x <= 30; x++) // x starts at 0, adds 1 to x until x equals 30
        {
            System.out.println(x);
        }

        for (int x=30; x>=0; x--) // x starts at 30, subtracts 1 until x equals 0
        {
            System.out.println(x);
        }

        for (int x=0; x<=18; x+=3) //x starts at 0, adds by 3 until x equals 18
        {
            System.out.println(x);
        }

        for (int x=10; x>=0; x-=2) //x starts at 10, subtracts by 2 until x equals 0
        {
            System.out.println(x);
        }
    }
}