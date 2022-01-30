/* Write a Java program to swap two variables without using a third variable. */

import java.util.*;

public class SwappingWithoutUsingThirdVariable
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping, value of num1: " + num1);
        System.out.println("Before swapping, value of num2: " + num2);

        // swapping technique
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping, value of num1: " + num1);
        System.out.println("After swapping, value of num2: " + num2);
        sc.close();

    }
}