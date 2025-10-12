

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");   
        int n = sc.nextInt();
        sc.close();
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
    }
    // Function to count the number of digits in a number
    // Time Complexity: O(d), where d is the number of digits in n  
    // Space Complexity: O(1), uses constant extra space
    private static int countDigits(int n) {
        if (n == 0) {
            return 1; // Special case for 0
        }
        int count = 0;
        n = Math.abs(n); // Handle negative numbers
        while (n > 0) {
            n /= 10; // Remove the last digit
            count++;
        }
        return count;
    }

    //Another approach to count digits using logarithm
    // Time Complexity: O(1)    
    // Space Complexity: O(1), uses constant extra space
    // private static int countDigits(int n) {
    //     if (n == 0) {    
    //         return 1; // Special case for 0
    //     }
    //     return (int) Math.log10(Math.abs(n)) + 1; // Handle negative numbers
    // }
    
}
