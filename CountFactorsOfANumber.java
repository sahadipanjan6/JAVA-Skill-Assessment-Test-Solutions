// Write a Java program to accepts an integer and count the factors of the number.

import java.util.*;

public class CountFactorsOfANumber
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int countFactors = 0;

        for(int i=2; i<number; i++)
        {
            if(number%i == 0)
                countFactors++;
        }
        System.out.println("Number of factors of " + number + " = " + countFactors);
        sc.close();
    }
}