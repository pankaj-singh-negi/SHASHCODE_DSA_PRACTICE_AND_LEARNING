import java.util.Scanner;

class Armstrong_Number {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");

        int num = sc.nextInt();
        if (armstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
		sc.close();
    }

    public static boolean armstrongNumber(int n) {
        // code here
        int count= (int) Math.log10(n) +1;

		int num=n;
		int res=0;
		while(num!=0)
		{
			int dig=num%10;
			res+=Math.pow(dig,count);
			num/=10;
		}

		if(res==n)
		{
			return true;
		}
		else
		{
			return false;
		}
        
    }
}

// Time Complexity: O(d), where d is the number of digits in num
// Space Complexity: O(1), uses constant extra space