/* Write a Java program to convert a decimal number to binary number. */

import java.util.*;

public class Decimal2Binary
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        String binary = "";

        int copy = number;
        while(copy != 0)
        {
            binary = (copy%2) + binary;
            copy /= 2;
        }

        System.out.println("Binary of " + number + " = " + binary);
        sc.close();
    }
}