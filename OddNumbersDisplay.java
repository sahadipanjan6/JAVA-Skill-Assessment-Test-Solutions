// Write a Java program to print the odd numbers from 1 to 99.

public class OddNumbersDisplay
{
    public static void main(String []args)
    {
        System.out.println("Odd numbers between 1 and 99 are:- ");
        for(int i=1; i<=99; i++)
        {
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}