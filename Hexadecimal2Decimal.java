// Write a Java program to convert a hexadecimal number to decimal number.

import java.util.*;

public class Hexadecimal2Decimal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Hexadecimal Number: ");
        String hx_num = sc.nextLine();
        int d_num = 0;

        for(int i=hx_num.length()-1,index=0; i>=0; i--,index++)
        {
            char digit = hx_num.charAt(i);

            if(digit == 'A')    
                d_num += 10 * Math.pow(16, index);
            else if(digit == 'B')
                d_num += 11 * Math.pow(16, index);
            else if(digit == 'C')
                d_num += 12 * Math.pow(16, index);
            else if(digit == 'D')
                d_num += 13 * Math.pow(16, index);
            else if(digit == 'E')
                d_num += 14 * Math.pow(16, index);
            else if(digit == 'F')
                d_num += 15 * Math.pow(16, index);
            else
                d_num += Character.getNumericValue(digit) * Math.pow(16, index);
        }
        System.out.println("Decimal Number: " + d_num);
        sc.close();
    }
}