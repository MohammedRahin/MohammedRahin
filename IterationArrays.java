
/**
 * Write a description of class IterationArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a description of class ArraysExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IterationArrays
{
    public static void main (String [] args)
    {
        int [] Array = new int [10];
        int [] Array2 = new int [10];
        for (int i=0; i<Array.length; i++)
        {
            Array[i]= twointegers(1,0);
            Array2[i] = twointegers(1,2);
        }
        for (int j=0; j<Array.length; j++)
        {
        System.out.println(Array[j]);
        System.out.println(Array2[j]);
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

