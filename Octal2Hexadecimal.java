// Write a Java program to convert an octal number to hexadecimal number.

import java.util.*;

public class Octal2Hexadecimal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any octal number: ");
        String o_num = sc.nextLine();
        int d_num = 0;
        String hx_num = "";

        // finding the decimal equivalent
        for(int i=o_num.length()-1,index=0; i>=0; i--,index++)
        {
            int digit = Character.getNumericValue(o_num.charAt(i));
            d_num += digit * Math.pow(8, index);
        }

        // finding the hexadecimal equivalent of the obtained decimal number
        int copy = d_num;
        while(copy != 0)
        {
            // writing the cases for concatenating the characters (A-F)
            int remainder = copy % 16;
            
            if(remainder < 10)
                hx_num = remainder + hx_num;

            else if(remainder == 10)
                hx_num = "A" + hx_num;

            else if(remainder == 11)
                hx_num = "B" + hx_num;

            else if(remainder == 12)
                hx_num = "C" + hx_num;

            else if(remainder == 13)
                hx_num = "D" + hx_num;

            else if(remainder == 14)
                hx_num = "E" + hx_num;

            else if(remainder == 15)
                hx_num = "F" + hx_num;

            copy /= 16;
        }
        System.out.println("Hexadecimal Number: " + hx_num);
        sc.close();
    }
}