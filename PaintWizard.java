import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class PaintWizard {
	private List<Paint> p = new ArrayList<Paint>();

	private ArrayList<Integer> sm = new ArrayList<Integer>();

	public static <T> void main(String[] args) {
		PaintWizard pw = new PaintWizard();
		Paint a = new Paint("CheapoMax", 19.99, 20, 10);
		Paint b = new Paint("AverageJoes", 17.99, 15, 11);
		Paint c = new Paint("DuluxourousPaints", 25.00, 10, 20);
		Paint[] fruits = new Paint[3];
		
		fruits[0]=a;
		fruits[1]=b;
		fruits[2]=c;
		Arrays.sort(fruits);
		
		

		int finaltotal = 0;
		pw.p.add(a);
		pw.p.add(b);
		pw.p.add(c);
		String length = JOptionPane.showInputDialog(null, "What's the length?");
		int check = 0;
		int sum = 0;
		int total = 0;
		int result = 0;
		int store = 0;
		int[] bc = new int[finaltotal];
		check = Integer.parseInt(length);
		int a1 = 0;
		for (int counter = 0; counter < pw.p.size(); counter++) {
			total = pw.p.get(counter).getTotal();
			result = (check - total);
			sum++;

			while (!(result <= 0)) {
				result = result - total;
				// System.out.println(result);
				store = result;

				sum++;
				// System.out.println(sum);

			}
			
			// System.out.println(sum);
			// System.out.println(pw.p.get(counter).getType() + " " + sum + "
			// ");

			finaltotal = (int) (pw.p.get(counter).getPrice() * sum);

			// System.out.println(finaltotal);
			//System.out.println(pw.p.get(counter).getType() + "    " + sum + " " + finaltotal);
			for(Paint temp: fruits){
				   System.out.println("Cheapest Paint " + " : " + temp.getType()+", price : " + finaltotal);
			
				 
				}
			
			
			
			
			
		
			sum = 0;
		
			
		
		
				
		}
		

	
		



	}

}
