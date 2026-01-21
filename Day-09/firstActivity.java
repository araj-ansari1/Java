
// Check Prime Number


import java.util.*;


public class firstActivity{
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number:  ");

		int value=scan.nextInt();
	
		Boolean isPrime=true;

		for(int i=2; i<value;i++){
			if(value%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(value+" Prime Number");
		}
		else{
			System.out.println(value+" is not a Prime Number");
		}
	}
}