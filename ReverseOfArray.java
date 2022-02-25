// Write a Java program to reverse an array of integer values.

import java.io.*;

public class ReverseOfArray
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of elements: ");
        int N = Integer.parseInt(br.readLine());

        int myArray[] = new int[N];
        System.out.println("Enter " + N + " elements...");
        for(int i=0; i<N; i++)
            myArray[i] = Integer.parseInt(br.readLine());

        int output[] = new int[N];
        int o_idx = 0;

        for(int j=myArray.length-1; j>=0; j--)
            output[o_idx++] = myArray[j];

        System.out.println("Reverse Array:- ");
        for(int index=0; index<o_idx; index++)
            System.out.print(output[index] + " ");
    }
}