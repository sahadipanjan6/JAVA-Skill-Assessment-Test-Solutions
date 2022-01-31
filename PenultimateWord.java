// Write a Java program to find the penultimate (next to last) word of a sentence.

import java.util.*;

public class PenultimateWord
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String input = sc.nextLine();
        String words[] = input.split(" ");
        System.out.println("Penultimate Word: " + words[words.length-2]);
        sc.close();
    }
}