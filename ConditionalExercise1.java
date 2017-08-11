
/**
 * Write a description of class ConditionalExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConditionalExercise1
{
    public static void main (String [] args)
    {
        System.out.println(TwoIntegers(2,3, true));
        System.out.println(TwoIntegers(3,3, false));
    }

    public static int TwoIntegers (int a, int b, boolean check)
    {
        int sum=0;

        if (check)
        {
            sum = a+b;
        }
        else 
        {
            sum = a*b;
        }
        return sum;

    }
}
