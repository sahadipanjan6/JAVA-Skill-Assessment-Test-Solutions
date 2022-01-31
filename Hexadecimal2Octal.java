// Write a Java program to convert a hexadecimal number to octal number.

import java.util.*;

public class Hexadecimal2Octal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Hexadecimal Number: ");
        String hx_num = sc.nextLine();
        int d_num = 0;
        String o_num = "";

        // finding the decimal equivalent of the hexadecimal number
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

        // finding the octal equivalent of the obtained decimal number
        int copy = d_num;
        while(copy != 0)
        {
            o_num = (copy%8) + o_num;
            copy /= 8;
        }
        System.out.println("Octal Number: " + o_num);
        sc.close();
    }
}