import java.util.Scanner;

class Decimal_to_any_base
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num =sc.nextInt();
        System.out.println("Enter the number to convert into desired base:"+ num);

        
        int base =sc.nextInt();
        System.out.println("Enter the base to convert the number into: "+ base);

        System.out.println("The equivalent of " + num + " in base " + base + " is :"+ decimalToAnyBase(num,base));
    }

    private static int decimalToAnyBase(int num, int base) {
     int res=0;
     int pow=0;
      int temp=num;
      while(temp>0)
      {
        int rem=temp%base;
        res+=rem*Math.pow(10,pow);

        temp/=base;
        pow++;
      }

      return res;
    }



}