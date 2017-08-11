
public class PrimeNumber2 {
	public static void main(String[] args) {

		String FirstString = "HELLOWORLD";
		String SECONDSTRING = "HIWORLDHELLO";

		char[] one = FirstString.toCharArray();
		char[] two = SECONDSTRING.toCharArray();
		char c = 0;
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < two.length; j++) {
				if (one[i]==two[j]) {
						
					c =two[j];
					i=i+1;
					
					System.out.print(c);
					
				
				}
				else {
					
				
					
				}
				
				
		
				
			
			
			
			
				//System.out.print(c);
			}
			//System.out.print(c);
			
		}
		

	}

}
