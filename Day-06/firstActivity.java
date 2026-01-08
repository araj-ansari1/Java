public class firstActivity{
	public static void main(String args[]){
		int value= Integer.parseInt(args[0]);
	

		if(value%2==0){
			System.out.println(value+" is an Even Number");
		}else{
			System.out.println(value+" is n Odd Number");
		}
	}
}