import java.util.Scanner;

public class Reverse_Number {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int n = sc.nextInt();

        System.out.println("Reversed Number " + n + " is: " + reverseDigits(n));
 
        }


public static int reverseDigits(int n) {
    int num = Math.abs(n);
    int reverse = 0;
    while (num != 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }
    return n < 0 ? -reverse : reverse;
}
}

// Time Complexity: O(d), where d is the number of digits in n
// Space Complexity: O(1), uses constant extra space