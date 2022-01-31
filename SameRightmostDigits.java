// Write a Java program that accepts three integers from the user and return true if
// two or more of them (integers ) have the same rightmost digit. The integers are non-negative.

import java.util.*;

public class SameRightmostDigits
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd integer: ");
        int num3 = sc.nextInt();

        int digit1 = num1%10;
        int digit2 = num2%10;
        int digit3 = num3%10;

        // checking for same rightmost digits
        if(digit1==digit2 && digit2==digit3)
            System.out.println("TRUE");
        
        else if(digit1==digit2 || digit2==digit3 || digit3==digit1)
            System.out.println("TRUE");

        else
            System.out.println("FALSE");

        sc.close();
    }
}