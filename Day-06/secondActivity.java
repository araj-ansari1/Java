public class secondActivity{
	public static void main(String args[]){

		int num=Integer.parseInt(args[0]);
		
		if(num>=60){
			System.out.println("First Division ");
		}
		else if(num>=45 && num<=59){
			System.out.println("Second Division ");
		}
		else if(num>=33 && num<=44){
			System.out.println("Third Division ");
		}
		else{
			System.out.println("You are Failed.!!!");
		}
	}	
}