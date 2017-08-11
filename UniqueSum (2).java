
public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(twonumber(1, 1, 3));

	}

	public static int twonumber(int a, int b, int c) {
		int sum = 0;

		if ((a != b) && (a != c)) {
			sum = a + b + c;
		}
		if ((b != a) && b != c) {
			sum = a + b + c;
		}
		else if ((b != a) && b != c){
			sum = a + b + c;
		}
		
		return sum;
	}

}
