import java.util.Scanner;

/**
 * This program converts a number from any base (up to base 10) to decimal (base 10).
 */
public class Any_base_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number in the given base
        System.out.print("Enter the number to convert into decimal: ");
        int num = sc.nextInt();

        // Prompt user to enter the base of the number
        System.out.print("Enter the base of the number (2-10): ");
        int base = sc.nextInt();

        // Validate base input
        if (base < 2 || base > 10) {
            System.out.println("Invalid base! Please enter a base between 2 and 10.");
            return;
        }

        // Display the result
        System.out.println("The decimal equivalent of " + num + " in base " + base + " is: " + anyBaseToDecimal(num, base));
        sc.close();
    }

    /**
     * Converts a number from any base (up to base 10) to decimal.
     * @param num The number in the given base.
     * @param base The base of the number.
     * @return The decimal equivalent of the number.
     */
    private static int anyBaseToDecimal(int num, int base) {
        int res = 0;    // Result in decimal
        int pow = 0;    // Power to place the digit at correct position
        int temp = num; // Temporary variable for processing

        // Process each digit from right to left
        while (temp > 0) {
            int rem = temp % 10; // Get the last digit
            res += rem * Math.pow(base, pow); // Convert to decimal and add to result
            temp /= 10; // Remove the last digit
            pow++;      // Move to next power of base
        }

        return res;
    }
}


// Time Complexity: O(d), where d is the number of digits in 'num'
// Space Complexity: O(1), uses constant extra space