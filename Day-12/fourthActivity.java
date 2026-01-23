
import java.util.*;



class prime{
	 
	long Chackrime(int n){

		if(n%2==0){
			System.out.println("Prime Number: "+n);
		}
		else{
			System.out.println("Number is Not Prime: ");
		}
	}
}
public class fourthActivity{
	public static void main(String args[]){
		
		prime obj=new prime();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=scan.nextInt();


		
		
		System.out.println("Prime Number: "+obj.Chackrime(num));
	}
}