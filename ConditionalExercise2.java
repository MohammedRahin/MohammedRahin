
/**
 * Write a description of class ConditionalExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConditionalExercise2
{
    public static void main (String [] args)
    {
        System.out.println(twointegers(1,0));
        System.out.println(twointegers(1,2));
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