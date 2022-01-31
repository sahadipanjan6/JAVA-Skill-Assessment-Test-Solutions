// Write a program in Java to accept an integer from the user and then calculate the
// sum of its digits.

import java.util.*;

public class SumOfDigits
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int copy = number;

        while(copy != 0)
        {
            sum += copy % 10;
            copy /= 10;
        }
        System.out.println("Sum of digits of " + number + " = " + sum);
        sc.close();
    }
}