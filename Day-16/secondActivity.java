import java.util.*;

public class secondActivity {

   
    static boolean isArmstrong(int num) {
        int value = num;
        int sum = 0;
	
	int result = String.valueOf(num).length();

       
        while (num > 0) {
            int n = num % 10;
            sum += Math.pow(n, result);
            num /= 10;
        }

        return sum == value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}
