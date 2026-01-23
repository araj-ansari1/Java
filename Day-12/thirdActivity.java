

import java.util.*;


class A{
	
	
	long CalculateFactorial(int n1){

		int result=1;
		for(int i=1; i<=n1; i++){
			result=result*i;
		}

		return result;
	
	}


	//Input
	








}

public class thirdActivity{
	public static void main(String args[]){
		A obj= new A();


		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scan.nextInt();


		System.out.println("Fact: = "+obj.CalculateFactorial(n));

	}
}