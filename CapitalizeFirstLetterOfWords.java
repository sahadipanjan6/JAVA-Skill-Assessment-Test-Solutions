// Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.*;

public class CapitalizeFirstLetterOfWords
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String input = sc.nextLine();
        String output = "";

        for(String word : input.split(" "))
        {
            output = output + Character.toUpperCase(word.charAt(0));
            output = output + word.substring(1, word.length()) + " ";
        }
        System.out.println("Output: " + output);
        sc.close();
    }
}