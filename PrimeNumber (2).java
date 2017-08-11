
public class PrimeNumber {
	
	public static void main(String[] args) {
		
		 int i =0;
	      
		 int num =0;
	
	       String  storeNumber = "";

	       for (i = 1; i <= 3000; i++)         
	       { 		  	  
	          int sum=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	            	 sum = sum + 1;
		     }
		  }
		  if (sum ==2)
		  {
		  
			  storeNumber = storeNumber + i + " ";
		  }	
	       }	
	       
	       System.out.println("Prime numbers from 0 to 3,000,000 are :");
	       System.out.println(storeNumber);

		
		
	}

        


}
