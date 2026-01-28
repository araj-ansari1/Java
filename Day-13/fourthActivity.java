import java.util.*;

class A {



    boolean isNiven(int num) {

        int n = num;
        int result = 0;

        while (num > 0) {

            int x = num % 10;
            result = result + x;
            num = num / 10;

        }

        if (n % result == 0) {

            return true;

        } else {

            return false;

        }

    }


}

public class fourthActivity{
    public static void main(String args[]){
        A obj = new A();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int value = scan.nextInt();

        System.out.println("Is Number " + value + " Niven:: " + obj.isNiven(value));

    }


}
