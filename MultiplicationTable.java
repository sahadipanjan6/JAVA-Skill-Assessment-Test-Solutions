/* Write a Java program that takes a number as input and prints its multiplication
table upto 10. */

import java.util.*;

public class MultiplicationTable
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++)
            System.out.println(number + " x " + i + " = " + (number*i));
        
        sc.close();
    }
}