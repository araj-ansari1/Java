import java.util.*;

class A{
	boolean isPalindrom(int num){
		int tem=num;
		int reverse=0;
		while(tem>0){
			int rem=tem%10;
			reverse=reverse*10+rem;
			tem=tem/10;
		}
		if(reverse==num){
			return true;
		}
		else{
			return false;
		}
	}
}
public class thirdActivity{
	public static void main(String args[]){	
		A obj =new A();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Entee tha Number: ");
		int value=scan.nextInt();
	
		System.out.println("The Number "+value+" is Palindrome:: "+obj.isPalindrom(value));

	}
}