// Write a Java program to reverse a word.

import java.util.*;

public class ReverseAWord
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();
        System.out.println("Output: " + new StringBuffer(word).reverse().toString());
        sc.close();
    }
}