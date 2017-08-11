

public class BlackJack{
	 public static void main (String [] args)
	    {
	        System.out.println(twonumber(20,18));

	    }

	    public static int twonumber (int a,int b)
	    {
	    	int sum =0;
	    	
	        if ((a>b)&&(a<=21))
	        {
	        	sum =a;
	        }
	        else if ((b>a)&&(b<=21)){
	        	sum =b;
	        	
	        }
	        
	        return sum;
	    }

}
