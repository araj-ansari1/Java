import java.util.*;

class A{
	boolean isPrime(int num){
		boolean isPrime=true;
		for(int i=2; i<num; i++){
			if(num%2==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
public class fifthActivity{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number:  ");
		int value=scan.nextInt();
		
		A obj=new A();
		
		System.out.println("Is Number "+value+" Prime = "+obj.isPrime(value);
	}
}