public class firstActivity{
	public static void main(String args[]){


		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		System.out.println("This is and:= "+(a&b));
		System.out.println("This is or:= "+(a|b));
		System.out.println("This is ^:= "+(a^b));
	}
}


		