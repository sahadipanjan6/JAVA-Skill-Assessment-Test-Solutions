/* Write a Java program that takes three numbers as input to calculate and print the
average of the numbers. */

import java.util.*;

public class Average
{
    public static void main(String []args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        for(int i=1; i<=3; i++)
            sum = sum + sc.nextInt();

        System.out.println("Average: " + (sum/3));
        sc.close();
    }
}