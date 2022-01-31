// Write a Java program to calculate the sum of two integers and return true if the
// sum is equal to a third integer.

import java.util.*;

public class SumEqualToAnotherNumber
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int first = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int second = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int third = sc.nextInt();

        if((first+second) == third)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        sc.close();
    }
}