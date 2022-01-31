// Write a Java program that accepts an integer (n) and computes the value of
// n+nn+nnn.

import java.util.*;

public class ComputingAValue
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int N = sc.nextInt();
        int firstNumber = N;
        int secondNumber = Integer.parseInt(Integer.toString(N) + Integer.toString(N));
        int thirdNumber = Integer.parseInt(Integer.toString(N)+Integer.toString(N)+Integer.toString(N));
        System.out.println("Output: " + (firstNumber+secondNumber+thirdNumber));
        sc.close();
    }
}