// Write a Java program to reverse a string.

import java.util.*;

public class ReverseAString
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String input = sc.nextLine();
        System.out.println("Reverse: " + new StringBuffer(input).reverse().toString());
        sc.close();
    }
}