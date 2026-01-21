

import java.util.*;

public class fourthActivity{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num= scan.mnextInt();
		
		int temp=num;
		int sum=0;
	
		while(temp>0){
			int rem=temp%10;
			int n=rem*rem*rem;
			sum = sum+n;
			temp= temp/10;
		}
		if(sum==num){
			System.out.println(num+" is a Armstrong Number");
		}
		else{
			System.out.println(num+ " is not a ArmStrong NUmber");
		}
	}
}