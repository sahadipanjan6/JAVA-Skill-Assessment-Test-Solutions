// Write a Java program to convert a decimal number to hexadecimal number.

import java.util.*;

public class Decimal2Hexadecimal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Decimal Number: ");
        int d_num = sc.nextInt();
        String hx_num = "";

        int copy = d_num;
        while(copy != 0)
        {
            int remainder = copy%16;
            
            if(remainder == 10)
                hx_num = 'A' + hx_num;
            else if(remainder == 11)
                hx_num = 'B' + hx_num;
            else if(remainder == 12)
                hx_num = 'C' + hx_num;
            else if(remainder == 13)
                hx_num = 'D' + hx_num;
            else if(remainder == 14)
                hx_num = 'E' + hx_num;
            else if(remainder == 15)
                hx_num = 'F' + hx_num;
            else
                hx_num = remainder + hx_num;

            copy /= 16;
        }
        System.out.println("Hexadecimal Number: " + hx_num);
        sc.close();
    }
}