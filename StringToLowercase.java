// Write a Java program to convert a given string into lowercase.

import java.util.*;

public class StringToLowercase
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String input = sc.nextLine();
        System.out.println("Output: " + input.toLowerCase());
        sc.close();
    }
}