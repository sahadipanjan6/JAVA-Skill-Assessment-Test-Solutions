// Write a Java program to print the ASCII value of a given character.

import java.util.*;

public class AsciiOfACharacter
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("ASCII of " + ch + " = " + (int)(ch));
        sc.close();
    }
}