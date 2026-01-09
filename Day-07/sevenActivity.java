public class sevenActivity{
	public static void main(String args[]){

		for (int i=1; i<=10; i++){

			if(i==5 || i==8){

				continue;		
						//Skip the further statement in current go.......!!
			}

			System.out.println(i);
		}

		System.out.println("--Out of Loop--");

	}
}