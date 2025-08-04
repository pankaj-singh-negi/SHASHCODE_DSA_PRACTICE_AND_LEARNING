import java.util.Scanner;

/**
 * This program converts a decimal (base 10) number to any base (up to base 10).
 */
class Decimal_to_any_base
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the decimal number
        System.out.print("Enter the decimal number to convert: ");
        int num = sc.nextInt();

        // Prompt user to enter the desired base
        System.out.print("Enter the base to convert the number into (2-10): ");
        int base = sc.nextInt();

         sc.close();

        // Validate base input
        if (base < 2 || base > 10) {
            System.out.println("Invalid base! Please enter a base between 2 and 10.");
            return;
        }

        // Display the result
        System.out.println("The equivalent of " + num + " in base " + base + " is: " + decimalToAnyBase(num, base));
       
    }

    /**
     * Converts a decimal number to the specified base (up to base 10).
     * @param num The decimal number to convert.
     * @param base The base to convert to.
     * @return The number in the new base, represented as an integer.
     */
    private static int decimalToAnyBase(int num, int base) {
        int res = 0;    // Result in the new base
        int pow = 0;    // Power to place the digit at correct position
        int temp = num; // Temporary variable for processing

        // Process each digit
        while (temp > 0) {
            int rem = temp % base; // Get remainder (digit in new base)
            res += rem * Math.pow(10, pow); // Place digit at correct position
            temp /= base; // Reduce the number
            pow++;        // Move to next position
        }

        return res;
    }
}
// Time Complexity: O(log_base(num)), since we divide num by base in each iteration
// Space Complexity: O(1), uses constant extra space