// Write a Java program to convert an octal number to decimal number.

import java.util.*;

public class Octal2Decimal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Octal Number: ");
        String o_num = sc.nextLine();
        int d_num = 0;

        for(int i=o_num.length()-1, index=0; i>=0; i--,index++)
        {
            int digit = Character.getNumericValue(o_num.charAt(i));
            d_num += digit * Math.pow(8, index);
        }
        System.out.println("Decimal Number: " + d_num);
        sc.close();
    }
}