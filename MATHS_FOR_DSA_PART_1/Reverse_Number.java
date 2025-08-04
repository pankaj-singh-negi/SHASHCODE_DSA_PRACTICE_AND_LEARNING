import java.util.Scanner;

public class Reverse_Number {
    
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int n = sc.nextInt();

        System.out.println("Reversed Number " + n + " is: " + reverseDigits(n));
 
        }


public static int reverseDigits(int n) {
        // Code here
     int num = n;
        int digit;
        int reverse = 0;
        while(num != 0){
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        return reverse;
    }
}