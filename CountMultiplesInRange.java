// Write a Java program to find the number of values in a given range divisible by a
// given value.

import java.util.*;

public class CountMultiplesInRange
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        int start = sc.nextInt();
        System.out.println("Enter ending point: ");
        int end = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        int countMultiples = 0;
        for(int i=start; i<=end; i++)
        {
            if(i%divisor == 0)
                countMultiples++;
        }
        System.out.println("Count of numbers divided by "+divisor+" in the range of "+
        start+" and "+end+" = "+countMultiples);

        sc.close();
    }
}