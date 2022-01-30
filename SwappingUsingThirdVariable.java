/* Write a Java program to swap two variables using a third variable. */

import java.util.*;

public class SwappingUsingThirdVariable
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

        int temp = 0;
        temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("After swapping, value of num1: " + num1);
        System.out.println("After swapping, value of num2: " + num2);
        sc.close();
    }
}