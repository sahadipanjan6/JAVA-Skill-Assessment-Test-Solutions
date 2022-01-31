// Write a program in Java to convert a decimal number to octal number.

import java.util.*;

public class Decimal2Octal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number: ");
        int d_num = sc.nextInt();
        int copy = d_num;
        String o_num = "";

        while(copy != 0)
        {
            o_num = (copy%8) + o_num;
            copy /= 8;
        }
        System.out.println("Octal Number: " + o_num);
        sc.close();
    }
}