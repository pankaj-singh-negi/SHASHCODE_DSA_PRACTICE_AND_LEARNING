import java.util.Scanner;

public class Find_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number to check if it is even or odd: ");
        int num = sc.nextInt();
         sc.close();
        // Check if the number is even or odd
        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    private static boolean isEven(int num) {
        // A number is even if it is divisible by 2
        return num % 2 == 0;
    }
}


// Time Complexity: O(1), single arithmetic operation
// Space Complexity: O(1), uses constant extra space