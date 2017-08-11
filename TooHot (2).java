
public class TooHot {
	public static void main(String[] args) {
		System.out.println(twonumber(100));

	}

	public static boolean twonumber(int temperature){
		boolean check = false;
		if ((temperature >= 60) &&(temperature <= 90))
		{
			check =true;
		}
		
		return check;
	}
}
