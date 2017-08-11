
/**
 * Write a description of class IterationExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IterationExercise
{
    public static void main (String [] args)
    {
        for (int i=0; i<=10; i++)
        {
            System.out.println(twointegers(1,0));
            System.out.println(twointegers(1,2));
        }
    }

    public static int twointegers (int a, int b)
    {
        int sum=0;

        if ((a == 0 || b == 0))
        {
            return a;
        }

        else 
        {
            sum = a+b;
        }
        return sum;

    }
}
