// Write a Java program to accept an integer from the user and find the summation of
// the factorials of its individual digits.

import java.util.*;

public class SumOfFactorialOfDigits
{
    public static int factorial(int number)
    {
        int fact = 1;
        for(int i=1; i<=number; i++)
            fact *= i;
        
        return fact;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int sum = 0;
        int copy = number;

        while(copy != 0)
        {
            sum += factorial(copy%10);
            copy /= 10;
        }
        System.out.println("Sum of factorial of digits of " + number + " = " + sum);
        sc.close();
    }
}